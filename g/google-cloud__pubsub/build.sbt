organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "3.6.0-b7cbe2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.1.0-68d3bd",
  "org.scalablytyped" %%% "google-auth-library" % "8.8.0-07b2b7",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-c15658",
  "org.scalablytyped" %%% "google-cloud__promisify" % "3.0.1-071908",
  "org.scalablytyped" %%% "google-gax" % "3.6.0-3d0354",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-53a993",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-80ddb5",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-caff8d",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.4.1-453de8",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-ba76ac",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.1-745e47",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
