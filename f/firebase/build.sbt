organization := "com.scalablytyped"
name := "firebase"
version := "5.5.7-cf8415"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20181102Z-5e76c2",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-db0e33",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-47cf25",
  "com.scalablytyped" %%% "firebase__auth" % "0.7.8-b7e5cb",
  "com.scalablytyped" %%% "firebase__auth-types" % "0.3.4-8c099f",
  "com.scalablytyped" %%% "firebase__database" % "0.3.6-415eac",
  "com.scalablytyped" %%% "firebase__database-types" % "0.3.2-ab43c4",
  "com.scalablytyped" %%% "firebase__firestore" % "0.8.6-cc80fb",
  "com.scalablytyped" %%% "firebase__firestore-types" % "0.7.0-b90c34",
  "com.scalablytyped" %%% "firebase__functions" % "0.3.1-f6ebad",
  "com.scalablytyped" %%% "firebase__functions-types" % "0.2.0-7aa93f",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.1-f202e2",
  "com.scalablytyped" %%% "firebase__messaging" % "0.3.6-7b1efb",
  "com.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-88b654",
  "com.scalablytyped" %%% "firebase__polyfill" % "0.3.3-766910",
  "com.scalablytyped" %%% "firebase__storage" % "0.2.4-d99363",
  "com.scalablytyped" %%% "firebase__storage-types" % "0.2.3-db77bd",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-755c3b",
  "com.scalablytyped" %%% "grpc" % "1.16.0-b7ba1d",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20181102Z-161673",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20181102Z-eca052",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "promise-polyfill" % "v6.0.2-dt-20181102Z-44f2c4",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-4227a4",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-0bb450",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-66e78b",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-f5e12a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-0cf4aa",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ce8b6f",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-7bf595",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4b6e52",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cea48",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c4603f",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-d6356e",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        