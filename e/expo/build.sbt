organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-518230"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-3f17d5",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-9c61b6",
  "org.scalablytyped" %%% "expo-font" % "7.0.0-605fcb",
  "org.scalablytyped" %%% "expo-linear-gradient" % "7.0.1-aa3535",
  "org.scalablytyped" %%% "expo-sqlite" % "7.0.0-63082c",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-65b587",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-888796",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-30ab77",
  "org.scalablytyped" %%% "react-native-view-shot" % "2.6.0-47f32b",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-0b031b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        