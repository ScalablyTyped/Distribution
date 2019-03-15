organization := "org.scalablytyped"
name := "firebase"
version := "5.9.0-db5de9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-c56fb1",
  "org.scalablytyped" %%% "firebase__app" % "0.3.12-e234e3",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.6-5d1ce4",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.5-185758",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.4-05187c",
  "org.scalablytyped" %%% "firebase__database" % "0.3.15-1e38b4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.7-0710bc",
  "org.scalablytyped" %%% "firebase__firestore" % "1.1.0-08d708",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.1.0-e51bba",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.2-d7fc5f",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.1-2d3e48",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.9-3db2dc",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.14-19e6ea",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.7-401b82",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.8-a81ead",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.11-22f0af",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.7-b8c92e",
  "org.scalablytyped" %%% "firebase__util" % "0.2.10-546759",
  "org.scalablytyped" %%% "grpc" % "1.19.0-398e25",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-2550bc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e15c6b",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4fd6b5",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b30bce",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190312Z-835320",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-11ee03",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-6d28c3",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-46201f",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63857b",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-fe2693",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c2c6bd",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-3b892b",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-97bb93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-8051ed",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-7152e5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1df087",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        