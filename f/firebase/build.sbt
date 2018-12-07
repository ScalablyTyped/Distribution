organization := "org.scalablytyped"
name := "firebase"
version := "5.6.0-b75bd9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-50a955",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-ddb776",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-dfb38e",
  "org.scalablytyped" %%% "firebase__auth" % "0.8.0-0d5a50",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.4.0-938621",
  "org.scalablytyped" %%% "firebase__database" % "0.3.7-9127cd",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-e6f0f4",
  "org.scalablytyped" %%% "firebase__firestore" % "0.8.8-52e252",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-3f3df2",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-82b06c",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-cb14b5",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-0df987",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-ff1074",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-1b6a5a",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-993826",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-ffad28",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-d20ea7",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-a1c12c",
  "org.scalablytyped" %%% "grpc" % "1.16.1-4d8b49",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-864ad3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-76729d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-bd847f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e1d881",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-9b70f4",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2605b5",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a3782",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-000df5",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ddce07",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-be31e2",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-b25b54",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b26c77",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ddd0b7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c727dc",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        