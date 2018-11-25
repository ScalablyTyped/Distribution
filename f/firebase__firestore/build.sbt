organization := "com.scalablytyped"
name := "firebase__firestore"
version := "0.8.5-19e834"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-1508e1",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-254ba4",
  "com.scalablytyped" %%% "firebase__firestore-types" % "0.7.0-05dbbc",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.1-a73797",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-45bc2d",
  "com.scalablytyped" %%% "grpc" % "1.15.1-636c4f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-4a3b37",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-2c7cd8",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2c8f62",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63e3a1",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-03b0c2",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-2abc1b",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-960bf5",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-e8e70d",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-c48b13",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-2fb531",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-0af194",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        