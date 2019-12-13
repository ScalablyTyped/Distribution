organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201912121214-b7e246"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-d3b20f",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-b871d7",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-0dff32",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191210Z-aec922",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-4d8396",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-57ebef",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-285a4c",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-ca6c1e",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-894e91",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        