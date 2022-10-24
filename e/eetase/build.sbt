organization := "org.scalablytyped"
name := "eetase"
version := "4.0-dt-20220215Z-9c0a94"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-e302a4",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2d64d4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7cb43e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
