organization := "org.scalablytyped"
name := "firebase"
version := "9.14.0-516fed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.4-4f0f72",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-8ef584",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.17-ef8c2c",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-a43a0d",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-120265",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.11-e43193",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-6e854a",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-e12783",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-5e0172",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-535646",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.3-8a41c6",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-6c7755",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.8-de84f5",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.16-346cc4",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-5011e0",
  "org.scalablytyped" %%% "firebase__messaging" % "0.11.0-a58203",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.1-f2997d",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.17-0ffc2d",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.15-631935",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-db56d3",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.14-7ffeaf",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-898cce",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-005ba9",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-0e68cd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-675c55",
  "org.scalablytyped" %%% "long" % "5.2.1-89c48a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-520780",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-985f97",
  "org.scalablytyped" %%% "rollup" % "3.3.0-8b6f2a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-9f473f",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-4a08fb",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-abe3d7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
