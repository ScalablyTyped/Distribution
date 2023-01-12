organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "3.2.1-80b0a6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-02f2db",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-061891",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-fc9d9c",
  "org.scalablytyped" %%% "google-cloud__promisify" % "3.0.1-58e38e",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-d86e48",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-5b4812",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-9373ff",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-26eb5a",
  "org.scalablytyped" %%% "long" % "5.2.1-93c497",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.3.0-f5c948",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-bce381",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-d84fef",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-ebeb9d",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
