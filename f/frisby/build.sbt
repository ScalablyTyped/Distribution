organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20190212Z-150539"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190322Z-b4b766",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-52cd79",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-455d3a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-c63ed2",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        