organization := "org.scalablytyped"
name := "firebase"
version := "9.22.0-7fea91"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.10.0-ca7a4b",
  "org.scalablytyped" %%% "firebase__app" % "0.9.10-0aacb8",
  "org.scalablytyped" %%% "firebase__app-check" % "0.7.0-d6e534",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.2.0-34a08c",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__auth" % "0.23.2-94bdb9",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.2.1-1c5f49",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__database" % "0.14.4-20f1db",
  "org.scalablytyped" %%% "firebase__firestore" % "3.12.0-b834eb",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.3.9-be5e98",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-daeacb",
  "org.scalablytyped" %%% "firebase__functions" % "0.9.4-67a12d",
  "org.scalablytyped" %%% "firebase__installations" % "0.6.4-264e43",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__messaging" % "0.12.4-a8cfb0",
  "org.scalablytyped" %%% "firebase__messaging-interop-types" % "0.2.0-507fef",
  "org.scalablytyped" %%% "firebase__performance" % "0.6.4-a7890e",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.4.4-6854cc",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.3.0-17a5c1",
  "org.scalablytyped" %%% "firebase__storage" % "0.11.2-d12721",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-57be43",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-8bbfd9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "rollup" % "3.21.7-e69163",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-65c886",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230417Z-66be90",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "trusted-types" % "2.0-dt-20230214Z-8c8094",
  "org.scalablytyped" %%% "typescript" % "5.0.4-f7d5cf",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
