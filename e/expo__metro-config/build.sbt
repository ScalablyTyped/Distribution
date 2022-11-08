organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.4.0-fbdc29"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b23fc5",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-efd9cc",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-412870",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-021aec",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-744489",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b54012",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-0b98d8",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-a2617e",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-fea14a",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-03b587",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-99bd9c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-b51cdd",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-83b7ad",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
