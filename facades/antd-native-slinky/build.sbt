organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907260330-795f23"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-8be5f8",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.11-657d46",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-9857a3",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190717Z-4b0893",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-549a43",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-741c74",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907081110-c5e780",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        