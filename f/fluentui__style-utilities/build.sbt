organization := "org.scalablytyped"
name := "fluentui__style-utilities"
version := "8.8.1-7cfa05"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-f01dc1",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-d40a2d",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-73eb96",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-c29777",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.2-3971e1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-6d095b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
