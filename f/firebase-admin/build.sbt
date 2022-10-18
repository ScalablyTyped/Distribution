organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.0-5f4710"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-7e39e4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.16-efbe00",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-fcc6c3",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-632c97",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-7e4bfa",
  "org.scalablytyped" %%% "google-auth-library" % "8.5.2-d349d5",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.0-6d4298",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.5.2-26f166",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-e3fe39",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-b4af17",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-4e862a",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-e67882",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-873d36",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-33af98",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-000822")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
