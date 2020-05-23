organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.7.3-7711ab"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-1e95bd",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-1a52ea",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.3-41e7c8",
  "org.scalablytyped" %%% "google-gax" % "1.14.2-dbd500",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.18-4c1f5f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.4-cbe160",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-5a5680",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-3b8d54",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-774adc",
  "org.scalablytyped" %%% "protobufjs" % "6.9.0-eb372e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
