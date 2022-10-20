organization := "org.scalablytyped"
name := "google-cloud__firestore"
version := "6.4.0-ec16e9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-03c31a",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-691b62",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-eaa21c",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-7aa1a8",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-a3c7dd",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-38a64f",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-bf5f18",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
