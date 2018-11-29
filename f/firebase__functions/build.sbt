organization := "com.scalablytyped"
name := "firebase__functions"
version := "0.3.3-6b3d4f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.5-25ed14",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-14e11f",
  "com.scalablytyped" %%% "firebase__functions-types" % "0.2.1-81fdd3",
  "com.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-62fda4",
  "com.scalablytyped" %%% "firebase__util" % "0.2.3-129b5c",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-890fdf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        