organization := "org.scalablytyped"
name := "firebase"
version := "9.12.1-19bb3d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.3-12608b",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-7aa751",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.15-04c6a4",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-491896",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.10-ecce46",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-5c8a80",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-f485f2",
  "org.scalablytyped" %%% "firebase__database" % "0.13.9-5daca0",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.1-db1700",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.1-fb5ac0",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.0-008be5",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.7-c92d72",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.15-af64f1",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__messaging" % "0.9.19-b2fca6",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.0-c4f375",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.15-8654af",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.14-9f984a",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-4d3086",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.12-a6dc93",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-1e338f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-89b0cc",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-06476c",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "rollup" % "3.2.3-c92d63",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-9b7283",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
