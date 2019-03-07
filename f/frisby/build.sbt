organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20190212Z-0745e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190225Z-f49a8a",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-4b7335",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-9a6119",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        