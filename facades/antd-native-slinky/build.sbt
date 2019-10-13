organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909200330-6ae59f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-051044",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-9a459c",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-e3016a",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-76b392",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-30b0dc",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-89a20a",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-6a3d5e",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-8e8f74",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-683415")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        