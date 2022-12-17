organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-e1664b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-21b5cb",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-a52625",
  "org.scalablytyped" %%% "preact" % "10.11.3-28fed3",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
