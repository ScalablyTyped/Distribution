organization := "org.scalablytyped"
name := "expect"
version := "29.2.0-6e8515"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.2.0-d6b4c8",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.0-f56adc",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.0-256936",
  "org.scalablytyped" %%% "pretty-format" % "29.2.0-869c0c",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
