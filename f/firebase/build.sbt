organization := "org.scalablytyped"
name := "firebase"
version := "5.8.4-059e72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-76463f",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-a9c13f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-55bcac",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.3-1df8ad",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.2-5d351d",
  "org.scalablytyped" %%% "firebase__database" % "0.3.12-6de1c4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.5-9f3c60",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.4-065ed3",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.2-f3698e",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.7-724f46",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-8f85a0",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.6-d883ae",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.11-600fd1",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-01f607",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.6-4396c2",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.8-16f589",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-cd94c4",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-78674a",
  "org.scalablytyped" %%% "grpc" % "1.18.0-c7c229",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-06f74b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-230f3e",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-4af46b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-9f7187",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-964263",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-0a9f1a",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-11ba80",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-194d25",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-fcd7c0",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-5309c0",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-22d711",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-b6fcaa",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dcfcdb",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7a72e9",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-a1c1c6",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-a2b675",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        