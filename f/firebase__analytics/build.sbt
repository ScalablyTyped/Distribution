organization := "org.scalablytyped"
name := "firebase__analytics"
version := "0.8.4-253079"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.3-0f86ba",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-2113bf",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-d8aaca",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
