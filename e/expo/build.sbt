organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-c787d2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "expo-asset" % "8.1.7-78c8d7",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-6eec21",
  "org.scalablytyped" %%% "expo-font" % "8.2.1-6bb464",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.2.1-932041",
  "org.scalablytyped" %%% "expo-sqlite" % "8.2.1-a52e71",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20200515Z-ed3225",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200515Z-536183",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200626Z-a59915",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-265679",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-7b35db",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-7d472f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
