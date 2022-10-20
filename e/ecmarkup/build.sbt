organization := "org.scalablytyped"
name := "ecmarkup"
version := "15.0.4-3422af"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "command-line-usage" % "5.0-dt-20211202Z-e7bc91",
  "org.scalablytyped" %%% "ecmarkdown" % "7.2.0-ce7387",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.41-00a35b",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.41-87163f",
  "org.scalablytyped" %%% "esfx__canceltoken" % "1.0.0-pre.41-7045a4",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.41-80d572",
  "org.scalablytyped" %%% "grammarkdown" % "3.2.0-d3d263",
  "org.scalablytyped" %%% "prex" % "0.4.9-b5daaf",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
