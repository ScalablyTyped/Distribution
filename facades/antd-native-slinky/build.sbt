organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907271058-3734a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-ae01ae",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.12-26260a",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-76c0ac",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190802Z-48f8ad",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-37b228",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-b3d941",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-b22ec1",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        