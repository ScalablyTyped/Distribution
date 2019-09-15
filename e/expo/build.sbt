organization := "org.scalablytyped"
name := "expo"
version := "34.0.4-160fc9"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-d2dd63",
  "org.scalablytyped" %%% "expo-asset" % "6.0.0-c606da",
  "org.scalablytyped" %%% "expo-constants" % "6.0.0-cef718",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-154ed5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-b412db",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-076e3c",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190913Z-d9e3aa",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "3.0.0-16da52")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        