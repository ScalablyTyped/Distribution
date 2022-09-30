organization := "org.scalablytyped"
name := "empower"
version := "1.2-dt-20211202Z-0c7bb9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower-core" % "1.2-dt-20211202Z-d70065",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20220818Z-84ddae",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
