organization := "org.scalablytyped"
name := "firebase"
version := "5.8.5-795c78"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-098e24",
  "org.scalablytyped" %%% "firebase__app" % "0.3.10-d752dc",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-8b6709",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.4-c7ad6c",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.3-7b0673",
  "org.scalablytyped" %%% "firebase__database" % "0.3.13-5eed28",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.6-365aad",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.5-09fa1f",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.3-a01059",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.0-ab018b",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.0-b58d1f",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.7-4d839b",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.12-cf571c",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.6-c61b6f",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.7-833705",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.9-3ef0e6",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.6-d5926a",
  "org.scalablytyped" %%% "firebase__util" % "0.2.8-84fe78",
  "org.scalablytyped" %%% "grpc" % "1.19.0-115278",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-862ffd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e859ac",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-921e8a",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-d4ffb6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-c78cec",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-c3e68e",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-a03f5d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-86ab76",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-86ed03",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-04aaa9",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a2cc95",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-4b38c0",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f020d2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-ae7ee1",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-f0cb50",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-225760",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        