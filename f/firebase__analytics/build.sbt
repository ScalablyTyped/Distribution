organization := "org.scalablytyped"
name := "firebase__analytics"
version := "0.6.2-89883c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.4.0-88e812",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-680562",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-8e61dd",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-fc6b40",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-06d2d6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
