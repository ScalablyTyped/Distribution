organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.3-ab0e13"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-8362e0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-fda910",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-c10e55",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-b61705",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-74b1c0",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-dac0df",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        