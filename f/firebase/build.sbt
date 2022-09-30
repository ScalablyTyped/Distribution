organization := "org.scalablytyped"
name := "firebase"
version := "9.10.0-96e8b9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.0-efe9b6",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-ce1791",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.12-4812d7",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-f0899b",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-c681f7",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.7-909391",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-ca0aef",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-85ef60",
  "org.scalablytyped" %%% "firebase__database" % "0.13.6-df573d",
  "org.scalablytyped" %%% "firebase__firestore" % "3.5.0-5c7c7b",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.1.25-6d413a",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.0-a98c71",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.4-3cc01d",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.12-f2a03e",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-a02e57",
  "org.scalablytyped" %%% "firebase__messaging" % "0.9.16-71671e",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.12-b3aaf1",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.11-a6eaaf",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-998d8f",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.9-087d48",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-f102dd",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-bbb0dd",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.1-b61edd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-6ef219",
  "org.scalablytyped" %%% "long" % "5.2.0-9c1ab6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-8eede4",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-b9b4c1",
  "org.scalablytyped" %%% "rollup" % "2.79.1-091416",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-afa19c",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-ee8a54",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-c0e5e0",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typescript" % "4.8.4-6579b4",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
