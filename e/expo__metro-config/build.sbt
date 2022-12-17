organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.5.1-b1e1f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-c49e13",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5ca42e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-82c4da",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-5dfb0f",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-5100e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-2c1a27",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-db5085",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-2275a0",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-715499",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-214064",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-c2b4f7",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-fe977c",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-966af1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
