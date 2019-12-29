organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.2.0-6d7c0d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-d403b2",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-b5fd23",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.3-31c987",
  "org.scalablytyped" %%% "google-gax" % "1.7.5-103f4f",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-c27092",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-1d4cc1",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-91bdf6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-377e28",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-7c5e79",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d9e832",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        