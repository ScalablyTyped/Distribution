organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "8.8.8-728e3a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-9dd215",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-962fe6",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-694a2e",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.2-c68497",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-4dfa9f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
