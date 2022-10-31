organization := "org.scalablytyped"
name := "google-gax"
version := "3.5.2-d83407"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-3bcd2f",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-44d246",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-47c97e",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-98b742",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-0ea18f",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "proto3-json-serializer" % "1.1.0-bdc80f",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
