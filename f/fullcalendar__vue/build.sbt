organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-28e7dc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-955b26",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-c7828f",
  "org.scalablytyped" %%% "preact" % "10.11.2-cbbdec",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
