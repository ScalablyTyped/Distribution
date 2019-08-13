organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907271058-4b2eea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-488890",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.13-5df0b8",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-0f8da0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190811Z-fb28ff",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-07a656",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-33ca84",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-a21c9e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        