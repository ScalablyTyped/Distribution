organization := "org.scalablytyped"
name := "firebase__firestore-compat"
version := "0.2.3-8a41c6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-8ef584",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-a43a0d",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-120265",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-6e854a",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-e12783",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-535646",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-6c7755",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-5011e0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-898cce",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-0e68cd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-675c55",
  "org.scalablytyped" %%% "long" % "5.2.1-89c48a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-985f97",
  "org.scalablytyped" %%% "rollup" % "3.3.0-8b6f2a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
