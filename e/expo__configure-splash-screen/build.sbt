organization := "org.scalablytyped"
name := "expo__configure-splash-screen"
version := "0.2.0-b36389"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color-string" % "1.5-dt-20200515Z-1a9ea5",
  "org.scalablytyped" %%% "commander" % "6.2.0-01a462",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "xml-js" % "1.6.11-41f994")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
