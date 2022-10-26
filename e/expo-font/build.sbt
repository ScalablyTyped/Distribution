organization := "org.scalablytyped"
name := "expo-font"
version := "10.2.1-ebeb4e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "expo-asset" % "8.6.1-c8a32c",
  "org.scalablytyped" %%% "expo-constants" % "13.2.4-7e9d6a",
  "org.scalablytyped" %%% "expo-modules-core" % "0.11.8-ca11b3",
  "org.scalablytyped" %%% "expo__config-types" % "46.0.2-adb196",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-0a69be",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
