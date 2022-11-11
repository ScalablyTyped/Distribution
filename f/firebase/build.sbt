organization := "org.scalablytyped"
name := "firebase"
version := "9.14.0-ebf6cf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.4-4cb0c6",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-b8bdad",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.17-fb8150",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-9a6d1a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-1b99ae",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.11-3090f0",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-dacf77",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-905454",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-3c2c8f",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-15ec1d",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.3-35f1a2",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-9e9839",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.8-5edd62",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.16-3675e8",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-d9a3b0",
  "org.scalablytyped" %%% "firebase__messaging" % "0.11.0-62847c",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.1-159984",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.17-da11d3",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.15-d15e94",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-dadb1e",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.14-c01ee9",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-4a44ae",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-975c5a",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-4085a2",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-f949f3",
  "org.scalablytyped" %%% "long" % "5.2.1-3917db",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-d782a8",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-c82aaa",
  "org.scalablytyped" %%% "rollup" % "3.2.5-1d3800",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-e7ea9b",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-663467",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-553558",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
