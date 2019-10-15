organization := "org.scalablytyped"
name := "expo"
version := "35.0.0-9e86ef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-cb4f00",
  "org.scalablytyped" %%% "expo-constants" % "7.0.0-a83f77",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-c3cabf",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-cc9d0b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-19fbea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        