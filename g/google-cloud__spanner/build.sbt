organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.1.4-4b66da"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-c2cb43",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-3344b7",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-03cda1",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.2-4f42a8",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-8034d7",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-5a32cf",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-dc5f79",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-fb68dc",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-00bc8d",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-6d7a04",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-a7c7d5",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20220818Z-d6c055",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-7b4c55")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
