organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.1.4-e5f360"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-118da6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5fc355",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c88cf8",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-65656f",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.2-05e711",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-6f0625",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-26d063",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-2a85ad",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-beed78",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-f80259",
  "org.scalablytyped" %%% "long" % "5.2.1-d0ec65",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-04705f",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-561144",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-e8ddf7",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20221103Z-9e1dc3",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-967666")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
