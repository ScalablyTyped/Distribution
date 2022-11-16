organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-8c0956"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-19fc1a",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-539e95",
  "org.scalablytyped" %%% "preact" % "10.11.3-615616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
