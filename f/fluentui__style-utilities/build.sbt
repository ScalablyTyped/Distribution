organization := "org.scalablytyped"
name := "fluentui__style-utilities"
version := "8.8.0-530158"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-1a0cc0",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-5950e4",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-17abf1",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.16-3e5e9b",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.1-5a78e7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-dd025c",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
