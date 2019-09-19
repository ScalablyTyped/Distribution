organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909080330-09e4c2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-80e86e",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.15-b72bab",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-008e1c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190917Z-cc8b5c",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-6fde39",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-fb88a0",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-a8d585",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-02a4ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        