organization := "org.scalablytyped"
name := "fullcalendar"
version := "6.1.7-1466f6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__core" % "6.1.7-267cbe",
  "org.scalablytyped" %%% "fullcalendar__interaction" % "6.1.7-a060b3",
  "org.scalablytyped" %%% "preact" % "10.14.0-c06e85",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
