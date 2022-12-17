organization := "org.scalablytyped"
name := "eetase"
version := "4.0-dt-20220215Z-a48bfa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-020668",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-42311c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-526f34")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
