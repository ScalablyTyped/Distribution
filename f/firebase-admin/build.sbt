organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.2.1-375fe9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-1b99ae",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-a3b1c7",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-d9a3b0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-4a44ae",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-5484cf",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-0e45e5",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.4.1-bab007",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.7.0-cfddb6",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-c65bd1",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4085a2",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-f949f3",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-8d49c3",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-832cde",
  "org.scalablytyped" %%% "long" % "5.2.1-3917db",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-324cfd",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-c82aaa",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-f5b1a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
