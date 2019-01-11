organization := "org.scalablytyped"
name := "firebase"
version := "5.7.3-47ec7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-afbed4",
  "org.scalablytyped" %%% "firebase__app" % "0.3.6-aacb5d",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-e14235",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.1-9411b6",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-0f6b0f",
  "org.scalablytyped" %%% "firebase__database" % "0.3.9-73d006",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-864ee3",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.3-2402b1",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-bf2bd5",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.4-4ab8e1",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-bc412c",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.3-623b89",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.8-2d0153",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-7ed564",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.4-ee95d6",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.5-526f65",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-a46cfc",
  "org.scalablytyped" %%% "firebase__util" % "0.2.4-0581ca",
  "org.scalablytyped" %%% "grpc" % "1.17.0-fd216c",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-27deba",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-fb9bd5",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-f1ebdd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-ca8e22",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-32d4d3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-623ff0",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c9cd0e",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-4d395a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-393c71",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-75a7a1",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a7a2c3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-87f989",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-449d21",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-747022",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-32e1b5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c56e65",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        