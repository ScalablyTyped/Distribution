organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.0-0f658f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-6f6d8a",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-db3818",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-2113bf",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-d8aaca",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-39d462",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-565255",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.0-56559d",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.7.0-a5d1ce",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-22462b",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4bcc1f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-b32195",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-7c92aa",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-23291f",
  "org.scalablytyped" %%% "long" % "5.2.1-0ea128",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-dcab71",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-440767")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
