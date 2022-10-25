organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.0-db85ef"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.16-1e7729",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-df0a46",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-ebaadd",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.0-33ed71",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.5.4-997d6f",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-7e4cd9",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-1e338f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-89b0cc",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-a4bc3e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-844797",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-4f0287",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-073168")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
