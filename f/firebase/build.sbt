organization := "org.scalablytyped"
name := "firebase"
version := "9.21.0-05aa7c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.10.0-8308b7",
  "org.scalablytyped" %%% "firebase__app" % "0.9.9-e8225c",
  "org.scalablytyped" %%% "firebase__app-check" % "0.7.0-6882ae",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.2.0-34a08c",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__auth" % "0.23.1-d0b962",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.2.1-1c5f49",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__database" % "0.14.4-a8b60b",
  "org.scalablytyped" %%% "firebase__firestore" % "3.11.0-4cdb5c",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.3.8-28aa99",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-daeacb",
  "org.scalablytyped" %%% "firebase__functions" % "0.9.4-ba3c44",
  "org.scalablytyped" %%% "firebase__installations" % "0.6.4-126b39",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__messaging" % "0.12.4-7a5c6f",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.2.0-507fef",
  "org.scalablytyped" %%% "firebase__performance" % "0.6.4-7b4208",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.4.4-543726",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.3.0-17a5c1",
  "org.scalablytyped" %%% "firebase__storage" % "0.11.2-73b669",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-53a993",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-80ddb5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-2bc985",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "rollup" % "3.21.6-dbf5a5",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-018880",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230417Z-66be90",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "trusted-types" % "2.0-dt-20230214Z-8c8094",
  "org.scalablytyped" %%% "typescript" % "5.0.4-f7d5cf",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-106f12")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
