organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.5.1-53ff0d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b21522",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-d52eaa",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-7a3f99",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-328949",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-ef8fd5",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-49bcdd",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-50fc6c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-4e6eae",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-45f935",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
