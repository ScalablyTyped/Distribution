organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "8.8.8-b4c1d3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-5a8cad",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-1c7dc5",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-1bae50",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.2-b3a8c7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-9a7cb3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
