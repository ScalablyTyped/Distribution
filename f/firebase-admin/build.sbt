organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.1-5c5a5a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-27abe0",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-a1d566",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-0225fd",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-11b0b6",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-c88cf8",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-65656f",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.1-3433dc",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.7.0-fac72e",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-26d063",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-2a85ad",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-beed78",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-f80259",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-c593ce",
  "org.scalablytyped" %%% "long" % "5.2.1-d0ec65",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-561144",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-e8ddf7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-967666")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
