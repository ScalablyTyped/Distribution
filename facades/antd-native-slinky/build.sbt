organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907271058-9c3975"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-3e050d",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.13-dbb234",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-a7bfbf",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190816Z-f2afb2",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-535ec8",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-5d1af8",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-7407bc",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-2d3dc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        