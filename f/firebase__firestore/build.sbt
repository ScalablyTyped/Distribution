organization := "org.scalablytyped"
name := "firebase__firestore"
version := "0.9.0-4ed8fb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-8fd839",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-16fd78",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-8a1b79",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-c4393c",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-e3b965",
  "org.scalablytyped" %%% "grpc" % "1.16.1-eae5ff",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-f98d31",
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
        