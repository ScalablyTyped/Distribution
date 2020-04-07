organization := "org.scalablytyped"
name := "expo"
version := "36.0.2-d46588"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "expo-asset" % "8.0.0-4a477f",
  "org.scalablytyped" %%% "expo-constants" % "8.0.0-5b92b6",
  "org.scalablytyped" %%% "expo-font" % "8.0.0-9411b9",
  "org.scalablytyped" %%% "expo-linear-gradient" % "8.0.0-2a10ad",
  "org.scalablytyped" %%% "expo-sqlite" % "8.0.0-81b03c",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-c71613",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20200226Z-fc854d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200318Z-8663a9",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-32321b",
  "org.scalablytyped" %%% "react-native-view-shot" % "3.0.2-7e938e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.0.0-4f1fa4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
