organization := "org.scalablytyped"
name := "firebase"
version := "5.7.3-d0a226"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-98d341",
  "org.scalablytyped" %%% "firebase__app" % "0.3.6-eecdee",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-6475ae",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.1-3f9065",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-daa867",
  "org.scalablytyped" %%% "firebase__database" % "0.3.9-d2ab51",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-fdf9cf",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.3-778f95",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-cc595c",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.4-c2f816",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-0b7b2d",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.3-47ffb1",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.8-b7340b",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-f3d9fe",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.4-8dc622",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.5-d6625c",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-4017b6",
  "org.scalablytyped" %%% "firebase__util" % "0.2.4-e266d2",
  "org.scalablytyped" %%% "grpc" % "1.17.0-cb415b",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-276dc8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-361529",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-3ea002",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-3de878",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-b1ab90",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-959624",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-4cbd9a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e150cf",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-0743f6",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-777313",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-494ba5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0366f",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-add352",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-339b33",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6dadc2",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1db5b2",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        