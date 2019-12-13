organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-dd46a4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-8658bf",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-5c8016",
  "org.scalablytyped" %%% "expo-font" % "7.0.0-092e56",
  "org.scalablytyped" %%% "expo-linear-gradient" % "7.0.1-041565",
  "org.scalablytyped" %%% "expo-sqlite" % "7.0.0-1f9cfe",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-749a24",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-81934b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191210Z-aec922",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191126Z-22cc8c",
  "org.scalablytyped" %%% "react-native-view-shot" % "2.6.0-be122d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-2a031e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        