organization := "org.scalablytyped"
name := "esfx__collections-linkedlist"
version := "1.0.0-pre.13-39c2af"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__collection-core" % "1.0.0-pre.13-38fa50",
  "org.scalablytyped" %%% "esfx__equatable" % "1.0.0-pre.13-0c0ef9",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
