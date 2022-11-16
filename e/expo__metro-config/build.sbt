organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.5.1-0ab1f9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-c49e13",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-61b7b8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-42cbbf",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3669d2",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b1d659",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-c2ec05",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-db5085",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-6d35d0",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-6f5130",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-34b5b9",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-39d296",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-e4570d",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-093784",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
