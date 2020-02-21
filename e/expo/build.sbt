organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-832b60"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-47a47a",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-ca82a9",
  "org.scalablytyped" %%% "expo-font" % "7.0.0-2c0f06",
  "org.scalablytyped" %%% "expo-linear-gradient" % "7.0.1-9b6c90",
  "org.scalablytyped" %%% "expo-sqlite" % "7.0.0-7d4052",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-2bc06d",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200128Z-36ed8b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-8d1cb4",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-1129e2",
  "org.scalablytyped" %%% "react-native-view-shot" % "2.6.0-76b32f",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-d514df")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
