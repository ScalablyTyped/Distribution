organization := "org.scalablytyped"
name := "ecmarkup"
version := "15.0.4-a99e0f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "command-line-usage" % "5.0-dt-20211202Z-858627",
  "org.scalablytyped" %%% "ecmarkdown" % "7.2.0-062127",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.41-00e9c1",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.41-50d6b9",
  "org.scalablytyped" %%% "esfx__canceltoken" % "1.0.0-pre.41-f1f4bb",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.41-13114e",
  "org.scalablytyped" %%% "grammarkdown" % "3.2.0-ffd402",
  "org.scalablytyped" %%% "prex" % "0.4.9-e5edbb",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
