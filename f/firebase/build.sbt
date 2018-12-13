organization := "org.scalablytyped"
name := "firebase"
version := "5.7.0-1f4e95"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2ab9a3",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-f5c7a1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-8d890d",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.0-4c29fb",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-649445",
  "org.scalablytyped" %%% "firebase__database" % "0.3.7-3dd8a3",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-45e715",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.0-d1ce42",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-6528b5",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-c6854d",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-f656c9",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-c4393c",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-d674d8",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-460868",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-8a259a",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-590ec2",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-6cb68c",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-ec9c8e",
  "org.scalablytyped" %%% "grpc" % "1.16.1-73833d",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-fcf52e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181120Z-e0c5f6",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-c54014",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-cf39e8",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d7cd87",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a2281d",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-eacc8a",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-9682d2",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-1d2334",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fec06d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-e6bd96",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c28576",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21ec1b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        