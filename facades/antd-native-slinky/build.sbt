organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907271058-307043"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-9937bc",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.15-2c9946",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-35380a",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190823Z-786e7e",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-74c69d",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-2f0abe",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-b45494",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-b3947d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        