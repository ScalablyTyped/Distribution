organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.1-498f49"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-90f9cd",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-dd3d28",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-02f2db",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-061891",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.1-c34175",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.7.0-b9a7b9",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-d86e48",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-5b4812",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-9373ff",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-26eb5a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e13f73",
  "org.scalablytyped" %%% "long" % "5.2.1-93c497",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-d84fef",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-ebeb9d",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-966e9c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
