organization := "org.scalablytyped"
name := "fluentui__style-utilities"
version := "8.7.12-72184e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-04f4a7",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-1bc9d3",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-73eab6",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.16-dc9c02",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.1-f7fa9c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-4fc7a3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
