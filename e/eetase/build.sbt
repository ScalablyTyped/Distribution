organization := "org.scalablytyped"
name := "eetase"
version := "4.0-dt-20220215Z-95d7cd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-ff89ba",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-192e95",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ea95fb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
