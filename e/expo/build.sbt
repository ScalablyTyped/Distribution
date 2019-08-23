organization := "org.scalablytyped"
name := "expo"
version := "34.0.4-254b2e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "expo-asset" % "6.0.0-68999a",
  "org.scalablytyped" %%% "expo-constants" % "6.0.0-caebe9",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-0d0bdc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190819Z-b760a5",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "3.0.0-5e1ce2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        