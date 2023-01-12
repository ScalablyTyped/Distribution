organization := "org.scalablytyped"
name := "fullcalendar__vue"
version := "5.11.2-ab5566"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fullcalendar__common" % "5.11.3-51fefc",
  "org.scalablytyped" %%% "fullcalendar__core" % "5.11.3-4d0310",
  "org.scalablytyped" %%% "preact" % "10.11.3-fede92",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
