organization := "org.scalablytyped"
name := "firebase__firestore-compat"
version := "0.2.2-a903fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.3-0f86ba",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-e847c1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-6f6d8a",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-732ba6",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-2f926f",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.2-ce6972",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-1be088",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-2113bf",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-d8aaca",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4bcc1f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-b32195",
  "org.scalablytyped" %%% "long" % "5.2.1-0ea128",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "rollup" % "3.2.5-600601",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
