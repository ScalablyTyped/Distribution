organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "2.6.0-d3d91b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-42c99c",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-d0f312",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "2.0.3-e062c6",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-ba6839",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-f21fd8",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-2d9c0f",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-322bb1",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-a49fd3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-86435f",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-710c8e",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-b084c3",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-f9a9f4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
