organization := "org.scalablytyped"
name := "firebase"
version := "9.14.0-02c3fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.4-ff7295",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-a168fd",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.17-5a38ac",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-fb46c5",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-27abe0",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.11-13500d",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-0fb04a",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-564526",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-44c0b6",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-919aac",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.3-08ba58",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-84a0a3",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.8-2dfa4f",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.16-1237e9",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-0225fd",
  "org.scalablytyped" %%% "firebase__messaging" % "0.11.0-1fb7bd",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.1-62b89c",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.17-e198b7",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.15-ffb0c0",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-bf52da",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.14-d5cdf8",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-11b0b6",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-8b3bb1",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-2a85ad",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-beed78",
  "org.scalablytyped" %%% "long" % "5.2.1-d0ec65",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d1740",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-e8ddf7",
  "org.scalablytyped" %%% "rollup" % "3.3.0-1c8d6b",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-e40b48",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-e69298",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ad21fc",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "typescript" % "4.9.3-52822d",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
