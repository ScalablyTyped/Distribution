organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "2.6.0-e0a78a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-7d5f42",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-933252",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "2.0.3-800f46",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-9d7379",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-3ee863",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-c89898",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-6696aa",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-599bb2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-ec9628",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-25268a",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-fc3ca4",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-e0a6c7",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
