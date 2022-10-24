organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-56aa9d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-5e79d5",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-84a44f",
  "org.scalablytyped" %%% "preact" % "10.11.2-5a8a5e",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
