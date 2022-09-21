organization := "org.scalablytyped"
name := "firebase"
version := "9.10.0-208b75"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.0-087a33",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-70e6f2",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.12-de111c",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-a5d272",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-fb8d43",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.7-f3baef",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-47169f",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-c48592",
  "org.scalablytyped" %%% "firebase__database" % "0.13.6-b6fc8b",
  "org.scalablytyped" %%% "firebase__firestore" % "3.5.0-a75264",
  "org.scalablytyped" %%% "firebase__firestore-compat" % "0.1.25-1279b8",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.0-e7b95c",
  "org.scalablytyped" %%% "firebase__functions" % "0.8.4-9283b4",
  "org.scalablytyped" %%% "firebase__installations" % "0.5.12-e6122d",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-442cc4",
  "org.scalablytyped" %%% "firebase__messaging" % "0.9.16-a34198",
  "org.scalablytyped" %%% "firebase__performance" % "0.5.12-84afa5",
  "org.scalablytyped" %%% "firebase__remote-config" % "0.3.11-0d0bec",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-3354f1",
  "org.scalablytyped" %%% "firebase__storage" % "0.9.9-38a242",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-0d2002",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-07bd44",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.0-db6617",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-7b2a61",
  "org.scalablytyped" %%% "long" % "5.2.0-13a867",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-876ac5",
  "org.scalablytyped" %%% "protobufjs" % "7.1.1-ba42e8",
  "org.scalablytyped" %%% "rollup" % "2.79.0-aeffd0",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-865474",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a59c87",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-d2df15",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
