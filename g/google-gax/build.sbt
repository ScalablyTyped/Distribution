organization := "org.scalablytyped"
name := "google-gax"
version := "3.5.2-586329"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-4cd399",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-2470e7",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-7d94fa",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-43d7de",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-864b57",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-665e8e",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
