organization := "org.scalablytyped"
name := "firebase__firestore-compat"
version := "0.2.3-260fb1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-b8bdad",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-9a6d1a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-1b99ae",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-dacf77",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-905454",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-ec71e6",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-9e9839",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-d9a3b0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-4a44ae",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4085a2",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-f949f3",
  "org.scalablytyped" %%% "long" % "5.2.1-3917db",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-c82aaa",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
