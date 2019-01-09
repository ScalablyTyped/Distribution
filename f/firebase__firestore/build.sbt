organization := "org.scalablytyped"
name := "firebase__firestore"
version := "0.9.2-627042"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-42f1fc",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-baa260",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-e6eb4c",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-623b89",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-0581ca",
  "org.scalablytyped" %%% "grpc" % "1.17.0-fd216c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-fb9bd5",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-f1ebdd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-ca8e22",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
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
        