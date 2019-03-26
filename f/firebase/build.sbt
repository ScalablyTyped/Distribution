organization := "org.scalablytyped"
name := "firebase"
version := "5.9.1-bb9855"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-31b7c8",
  "org.scalablytyped" %%% "firebase__app" % "0.3.13-67279d",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.7-b18e35",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.6-97ac9e",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.5-fe91a9",
  "org.scalablytyped" %%% "firebase__database" % "0.3.16-5d1785",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.8-1eca1c",
  "org.scalablytyped" %%% "firebase__firestore" % "1.1.1-77b803",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.1.1-718915",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.3-80c46a",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.2-ec4043",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.10-4b0608",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.15-3e5d39",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.8-f85c06",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.9-402d1a",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.12-522b71",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.8-d0eca4",
  "org.scalablytyped" %%% "firebase__util" % "0.2.11-d50940",
  "org.scalablytyped" %%% "grpc" % "1.19.0-b0dc86",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-a8fc81",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-9cda2a",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-d34993",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-5e7d19",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190312Z-5defa8",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-74d5c7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-3fda9f",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-a553ba",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-44776c",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-1fbdf8",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-233427",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-27bccb",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-3d4587",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-052e31",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c26550",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-52025e",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        