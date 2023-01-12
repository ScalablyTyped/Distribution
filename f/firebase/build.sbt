organization := "org.scalablytyped"
name := "firebase"
version := "9.14.0-7294a7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.4-d9172b",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-517873",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.17-b02044",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-7689fb",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-90f9cd",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.11-55f175",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-5c1025",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-14f95c",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-961ea2",
  "org.scalablytyped" %%% "firebase__firestore" % "3.7.3-0dabb9",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.2.3-89eae9",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-2ee6fb",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.8-c4b0fe",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.16-b79ba1",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__messaging" % "0.11.0-62b264",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.1.1-2519da",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.17-6d81c9",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.15-cb551e",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-ca34f8",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.14-159bd0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-6ffa19",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-5b4812",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-9373ff",
  "org.scalablytyped" %%% "long" % "5.2.1-93c497",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d4a26",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-ebeb9d",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-123b63",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a1b7c7",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ea1648",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
