organization := "org.scalablytyped"
name := "firebase"
version := "9.13.0-4a8795"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.4-253079",
  "org.scalablytyped" %%% "firebase__app" % "0.8.3-0f86ba",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.16-0dc632",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-e847c1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-6f6d8a",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.11-1aef21",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-732ba6",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-2f926f",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-5f71e4",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.2-4931c0",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.2-6633b5",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-1be088",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.8-117ec2",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.16-a6be5f",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-2113bf",
  "org.scalablytyped" %%% "firebase__messaging" % "0.10.0-95589e",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.1-6aef0a",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.16-97f4ac",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.15-2eef38",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-7b3a4d",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.13-8c88df",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-d8aaca",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-47c97e",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-98b742",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-2f020e",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "rollup" % "3.2.5-600601",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-7d374b",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-cacb98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
