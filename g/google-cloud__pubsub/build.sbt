organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "3.2.1-31f91d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c90b6e",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-8d869d",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-d79850",
  "org.scalablytyped" %%% "google-cloud__promisify" % "3.0.1-18187b",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-760085",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-0e68cd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-675c55",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-7ff90f",
  "org.scalablytyped" %%% "long" % "5.2.1-89c48a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.3.0-04d5c6",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-ade05a",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-ac389a",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-985f97",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
