organization := "org.scalablytyped"
name := "expo-file-system"
version := "6.0.2-e92bf3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190823Z-786e7e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "unimodules__core" % "3.0.2-fa0f27",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "3.0.0-e6336f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        