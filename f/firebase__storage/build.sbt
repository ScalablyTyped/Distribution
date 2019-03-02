organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.9-5cf6dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.10-2d17c8",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-040f4f",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.6-370b2a",
  "org.scalablytyped" %%% "firebase__util" % "0.2.8-9a6cc6",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        