organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-8af4ee"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-f7a684",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-85def9",
  "org.scalablytyped" %%% "preact" % "10.11.0-06155e",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
