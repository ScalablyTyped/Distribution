organization := "org.scalablytyped"
name := "google-cloud__spanner"
version := "6.9.0-1fa3f9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "big_dot_js" % "6.1-dt-20220913Z-8c0174",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-abf8ed",
  "org.scalablytyped" %%% "gaxios" % "5.1.0-a4e290",
  "org.scalablytyped" %%% "google-auth-library" % "8.8.0-57d623",
  "org.scalablytyped" %%% "google-cloud__common" % "4.0.3-fb9479",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "3.0.1-c15658",
  "org.scalablytyped" %%% "google-gax" % "3.6.0-122cbc",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-57be43",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-8bbfd9",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-64b5f4",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "p-queue" % "7.3.4-1dc14f",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.1-596b6d",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20221103Z-0d4c02",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "teeny-request" % "8.0.3-013671")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
