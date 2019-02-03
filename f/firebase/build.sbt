organization := "org.scalablytyped"
name := "firebase"
version := "5.8.2-7e8420"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8a719e",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-c8dd09",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-6735a2",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.2-c1b9e0",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.1-01cd17",
  "org.scalablytyped" %%% "firebase__database" % "0.3.11-84efd4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.4-f0ed44",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.2-c561e9",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.1-11a2c6",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.6-48fcda",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.2-1c156e",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.5-1275ac",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.10-1250d0",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.4-a3aa3a",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.5-e755ea",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.7-2814e2",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.4-a7fa35",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-051cad",
  "org.scalablytyped" %%% "grpc" % "1.18.0-587031",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-292775",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-ab1fa3",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-153059",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-ed7143",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4186d9",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-e26d13",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-6367f2",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a9473",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ee2249",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b87ef3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0df27",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f2eb3d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cc4d0",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-22c235",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9c4942",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        