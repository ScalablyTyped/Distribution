organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-d85eb6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "expo-asset" % "8.1.4-374c9a",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-6ab0f9",
  "org.scalablytyped" %%% "expo-font" % "8.1.1-888985",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.1.0-7c659c",
  "org.scalablytyped" %%% "expo-sqlite" % "8.1.0-4b02e3",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-d7b459",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200226Z-73fdca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-1131d6",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-7ae8fc",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-c5b70a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-d716e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
