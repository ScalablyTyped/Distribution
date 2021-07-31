organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "2.6.0-bd2ad5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-03b8be",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-07bb56",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "2.0.3-2a440a",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-06f41e",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-2716d8",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-336ba7",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-d03733",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-d40319",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-a534c4",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-9accee",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-4ae15d",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-cbfb36",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
