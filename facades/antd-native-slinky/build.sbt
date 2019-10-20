organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909200330-2264f1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-04d14d",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-9cf95f",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-9bf186",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191015Z-f406b4",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-128f10",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-687802",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-37507b",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-c8506a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-683415")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        