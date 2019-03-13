organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20190212Z-7c8ca6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190307Z-b4b766",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-52cd79",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-f12d33",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-186caf",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        