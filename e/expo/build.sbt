organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-89e0f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-8ec18c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-39a76d",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-5f8ae0",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-1bc4af",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        