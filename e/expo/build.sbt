organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-7e145e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "expo-asset" % "8.1.5-d8723b",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-c7f569",
  "org.scalablytyped" %%% "expo-font" % "8.1.1-85087e",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.1.0-cc8e72",
  "org.scalablytyped" %%% "expo-sqlite" % "8.1.0-ff97a2",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20200515Z-0fbcbc",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200515Z-6b2121",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200515Z-139570",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-db9db5",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-be2cc8",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-a541a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
