organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "3.2.1-d41e20"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-39d462",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-565255",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-8034d7",
  "org.scalablytyped" %%% "google-cloud__promisify" % "3.0.1-539ab0",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-22462b",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4bcc1f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-b32195",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-7c92aa",
  "org.scalablytyped" %%% "long" % "5.2.1-0ea128",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-48496a",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-de11a3",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-dcab71",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
