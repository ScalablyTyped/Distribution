organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.5.1-1bd66b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b23fc5",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-0a8cda",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-aeb792",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-0c7c84",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-7d45e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-92b979",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-55589a",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-6fb793",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-463097",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-552b21",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-3908fe",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-fc29a1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
