organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-6f4edb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-3d1470",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-0e4860",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-81934b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-a0fb20",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-98567f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        