organization := "org.scalablytyped"
name := "google-cloud__text-to-speech"
version := "4.0.3-126d7c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-87b97a",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-23a902",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-bcbb02",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-37f04e",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-20a3df",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-b396ed",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-e03382",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
