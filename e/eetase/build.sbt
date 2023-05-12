organization := "org.scalablytyped"
name := "eetase"
version := "4.0-dt-20220215Z-8085e5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-62a45e",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8fb2b2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-cdee41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
