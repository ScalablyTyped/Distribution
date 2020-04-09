organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-418c3c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "expo-asset" % "8.1.4-e58857",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-5b92b6",
  "org.scalablytyped" %%% "expo-font" % "8.1.1-185e55",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.1.0-d88e75",
  "org.scalablytyped" %%% "expo-sqlite" % "8.1.0-6b9df8",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-ff0cfc",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200226Z-fc854d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-401c8f",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-d136fc",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-7675a3",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-f5753b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
