organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201912121214-3fd873"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-58f2a7",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-b8a0d9",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-06e5af",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-54d733",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-e9a204",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-f33ce1",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-78141e",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-ba5e8b",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        