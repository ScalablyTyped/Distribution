organization := "org.scalablytyped"
name := "firebase-admin"
version := "11.0.1-de50a0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-c681f7",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.13-5ee23d",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-a02e57",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-f102dd",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-3b05d6",
  "org.scalablytyped" %%% "google-auth-library" % "8.5.2-74358f",
  "org.scalablytyped" %%% "google-cloud__firestore" % "6.2.0-a1c627",
  "org.scalablytyped" %%% "google-cloud__storage" % "6.5.2-5398ed",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-4f19ca",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.1-b61edd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-6ef219",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-609e4e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-2d28cd",
  "org.scalablytyped" %%% "long" % "5.2.0-9c1ab6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-ef7a46",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-b9b4c1",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-f3aabb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
