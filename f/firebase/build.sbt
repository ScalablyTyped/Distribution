organization := "org.scalablytyped"
name := "firebase"
version := "5.8.1-9cd79c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-f27478",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-00c385",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-b912fd",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.2-366069",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.1-84133b",
  "org.scalablytyped" %%% "firebase__database" % "0.3.11-9b2c78",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.4-11d0f6",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.1-344896",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.1-20db00",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.6-068263",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.2-9617bc",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.5-776885",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.10-385517",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.4-46bade",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.5-4e1d9b",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.7-7157b1",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.4-d6a5b0",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-f2490c",
  "org.scalablytyped" %%% "grpc" % "1.17.0-88bcf4",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-de27fe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-8280c6",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-40b0b6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-e44ec3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-13a464",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-7966c6",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c09989",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-991424",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-e42de9",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-e729e8",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-27c8f0",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bf95d8",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4a99f0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-01c06c",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-503643",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-6d707c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        