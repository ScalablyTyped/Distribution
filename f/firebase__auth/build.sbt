organization := "com.scalablytyped"
name := "firebase__auth"
version := "0.7.9-2eab35"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.5-25ed14",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-14e11f",
  "com.scalablytyped" %%% "firebase__auth-types" % "0.3.4-5b5685",
  "com.scalablytyped" %%% "firebase__util" % "0.2.3-129b5c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        