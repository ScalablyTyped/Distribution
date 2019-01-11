organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.4-c2f816"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.6-eecdee",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-6475ae",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-0b7b2d",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-f3d9fe",
  "org.scalablytyped" %%% "firebase__util" % "0.2.4-e266d2",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-276dc8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        