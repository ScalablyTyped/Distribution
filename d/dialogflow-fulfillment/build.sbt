organization := "org.scalablytyped"
name := "dialogflow-fulfillment"
version := "0.6-dt-20211202Z-73124a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "actions-on-google" % "3.0.0-71a8fd",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-801ab1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c88cf8",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-65656f",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-f80259",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
