organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.1-996e42"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-120265",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-065229",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-5011e0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-898cce",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c90b6e",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-8d869d",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.1-3abcaa",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.7.0-2f0c61",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-760085",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-0e68cd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-675c55",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-7ff90f",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-b73df8",
  "org.scalablytyped" %%% "long" % "5.2.1-89c48a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-ac389a",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-985f97",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-2ce28a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
