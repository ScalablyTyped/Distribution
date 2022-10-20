organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.4.0-0aafdf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-480a63",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-7b08cb",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.4-d9b25c",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1ba1f6",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-c1ebb8",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-765d0b",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-74e775",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-eb1235",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-61e708",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-6a15f1",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-3928e0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
