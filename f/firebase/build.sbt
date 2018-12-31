organization := "org.scalablytyped"
name := "firebase"
version := "5.7.2-0b98b5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ec75e2",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-8362e0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-fda910",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.1-3cecaa",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-f85ad2",
  "org.scalablytyped" %%% "firebase__database" % "0.3.8-ea863e",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-7d68cc",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.2-cc05b5",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-05c08a",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-ab0e13",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-c10e55",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-d7d95f",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-4e90c2",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-b61705",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-b05909",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-5d2480",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-a0bc57",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-74b1c0",
  "org.scalablytyped" %%% "grpc" % "1.17.0-13cb44",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-dac0df",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-c58c27",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-9ca62e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-c30cf6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-ab251e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-770897",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c931e6",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-5e843a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-30774a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-592e97",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-e194a5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9d3553",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1d4f93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-35f35b",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-eddee7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-946a5f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        