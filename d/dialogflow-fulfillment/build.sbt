organization := "org.scalablytyped"
name := "dialogflow-fulfillment"
version := "0.6-dt-20211202Z-48f7b9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "actions-on-google" % "3.0.0-0edcde",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20220924Z-713bfe",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-96a1cd",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-3b05d6",
  "org.scalablytyped" %%% "google-auth-library" % "8.5.2-74358f",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-609e4e",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
