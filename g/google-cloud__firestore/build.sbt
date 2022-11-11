organization := "org.scalablytyped"
name := "google-cloud__firestore"
version := "6.4.1-bab007"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-5484cf",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-0e45e5",
  "org.scalablytyped" %%% "google-gax" % "3.5.2-c65bd1",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4085a2",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-f949f3",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-8d49c3",
  "org.scalablytyped" %%% "long" % "5.2.1-3917db",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-324cfd",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-c82aaa",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
