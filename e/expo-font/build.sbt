organization := "org.scalablytyped"
name := "expo-font"
version := "11.0.1-45b58b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "expo-asset" % "8.6.2-4db241",
  "org.scalablytyped" %%% "expo-constants" % "14.0.2-4952ef",
  "org.scalablytyped" %%% "expo-modules-core" % "1.0.2-03fa80",
  "org.scalablytyped" %%% "expo__config-types" % "47.0.0-8c10ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-3962e1",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
