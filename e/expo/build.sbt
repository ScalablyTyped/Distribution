organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-8a5ee9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-91817c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190717Z-40a360",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-d15f9a",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.3-41f492",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        