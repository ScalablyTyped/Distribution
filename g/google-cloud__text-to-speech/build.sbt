organization := "org.scalablytyped"
name := "google-cloud__text-to-speech"
version := "4.0.3-1f3748"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-7e4bfa",
  "org.scalablytyped" %%% "google-auth-library" % "8.5.2-d349d5",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-e3fe39",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-b4af17",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-4e862a",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-e67882",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-33af98",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
