organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.1.4-d62461"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-516881",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-0503e8",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-02f2db",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-061891",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.2-469afc",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-fc9d9c",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-d86e48",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-5b4812",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-9373ff",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-26eb5a",
  "org.scalablytyped" %%% "long" % "5.2.1-93c497",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-12bd38",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-d84fef",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-ebeb9d",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20221103Z-2ea842",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-966e9c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
