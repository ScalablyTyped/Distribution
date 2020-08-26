organization := "org.scalablytyped"
name := "expo-location"
version := "8.3.0-caed6b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20200723Z-d06c5c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "unimodules-permissions-interface" % "5.2.1-97b407",
  "org.scalablytyped" %%% "unimodules__core" % "5.3.0-738d4d",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.4.0-aa9e83")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
