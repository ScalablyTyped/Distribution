organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201912121214-5cb760"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-6d4d3b",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.2-770174",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-39a65c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191230Z-16d6c0",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-d143ad",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-6e3a24",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-532d9e",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-d77d01",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-b72fb0",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        