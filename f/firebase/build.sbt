organization := "org.scalablytyped"
name := "firebase"
version := "5.9.4-e1efc2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-aa40e6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.15-0099de",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.8-74462f",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.8-d62df7",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.6-51e54f",
  "org.scalablytyped" %%% "firebase__database" % "0.3.18-2c4762",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.9-6c1838",
  "org.scalablytyped" %%% "firebase__firestore" % "1.1.4-bb00ce",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.1.2-25f3a4",
  "org.scalablytyped" %%% "firebase__functions" % "0.4.4-3b3168",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.3-f7ef9b",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.11-5150c2",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.17-4121bc",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.9-9fe400",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.11-1eefdb",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.13-1debcd",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.9-c850f8",
  "org.scalablytyped" %%% "firebase__util" % "0.2.12-ed260d",
  "org.scalablytyped" %%% "grpc" % "1.19.0-38d4b4",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-80d5e0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-01e943",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4f4f78",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-418504",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190312Z-6cb842",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-1d4c98",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-7d3a63",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e9c001",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-7658b2",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-d98038",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-04dd70",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-115d28",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1fe064",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-aa4a7f",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-87cd30",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-3bda91",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        