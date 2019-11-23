organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-8f8a78"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-5dd8a0",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-4ccc22",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-2fae9b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-89fb36",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-d1dfc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        