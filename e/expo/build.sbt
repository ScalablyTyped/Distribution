organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-300253"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-b148bb",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-17a168",
  "org.scalablytyped" %%% "expo-font" % "7.0.0-314e69",
  "org.scalablytyped" %%% "expo-linear-gradient" % "7.0.1-64e54b",
  "org.scalablytyped" %%% "expo-sqlite" % "7.0.0-536a6d",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-9fe622",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-f60151",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200117Z-abf5f4",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-3ae105",
  "org.scalablytyped" %%% "react-native-view-shot" % "2.6.0-6b087c",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-b01e93")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        