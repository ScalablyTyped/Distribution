organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909200330-c13bae"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-97557a",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-6af4e9",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-15646f",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190930Z-0fb035",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-727e83",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-379b93",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-3c2759",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-83c539",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-02a4ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        