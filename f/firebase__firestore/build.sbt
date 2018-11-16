organization := "com.scalablytyped"
name := "firebase__firestore"
version := "0.8.6-cc80fb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-db0e33",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-47cf25",
  "com.scalablytyped" %%% "firebase__firestore-types" % "0.7.0-b90c34",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.1-f202e2",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-755c3b",
  "com.scalablytyped" %%% "grpc" % "1.16.0-b7ba1d",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20181102Z-eca052",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
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
        