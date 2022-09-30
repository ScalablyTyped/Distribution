organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.1.4-276850"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-8ed1a6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-b75196",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-3b05d6",
  "org.scalablytyped" %%% "google-auth-library" % "8.5.2-74358f",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.2-8fe4f6",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-b9ec29",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-4f19ca",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.1-b61edd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-6ef219",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-609e4e",
  "org.scalablytyped" %%% "long" % "5.2.0-9c1ab6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-cd4cbc",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-ef7a46",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-b9b4c1",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20220818Z-13591a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-f3aabb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
