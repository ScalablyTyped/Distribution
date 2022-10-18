organization := "org.scalablytyped"
name := "firebase"
version := "9.12.1-126a21"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.3-183e5c",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-89416d",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.15-bada45",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-d3f9b0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-7e39e4",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.10-0caa0b",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-d88ada",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-e0fad8",
  "org.scalablytyped" %%% "firebase__database" % "0.13.9-713714",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.1-2a9a1b",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.1-e2b836",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.0-b73dbe",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.7-3ac38d",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.15-55b710",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-fcc6c3",
  "org.scalablytyped" %%% "firebase__messaging" % "0.9.19-75427e",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.0-8b7c75",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.15-1a5a48",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.14-e18f61",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-7c56e8",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.12-58f86d",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-632c97",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-b4af17",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-4e862a",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-b6784f",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "rollup" % "3.2.3-eed8d7",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-a87c96",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-86edef",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-e3da4a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
