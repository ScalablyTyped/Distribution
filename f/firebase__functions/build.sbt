organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.4.3-ba1e15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.14-98bb0f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.7-7f6007",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.2-f7ef9b",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.8-acfb16",
  "org.scalablytyped" %%% "firebase__util" % "0.2.11-c3b119",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-80d5e0",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        