organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.1.4-b5c6dd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-6c8666",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5bff7d",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c90b6e",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-8d869d",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.2-36b640",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-d79850",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-760085",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-0e68cd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-675c55",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-7ff90f",
  "org.scalablytyped" %%% "long" % "5.2.1-89c48a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-2ae15d",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-ac389a",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-985f97",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20221103Z-b4a8c1",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-2ce28a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
