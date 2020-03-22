organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-fa3462"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "expo-asset" % "8.0.0-4a477f",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-5b92b6",
  "org.scalablytyped" %%% "expo-font" % "8.0.0-9411b9",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.0.0-3f5766",
  "org.scalablytyped" %%% "expo-sqlite" % "8.0.0-81b03c",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-e9036c",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200128Z-fc854d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-9c1107",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-b94ea7",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-8ffabc",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-45523c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
