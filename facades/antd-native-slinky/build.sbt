organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201907271058-76748f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-35c236",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.1.12-ff11d1",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-76c34c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190807Z-04c1be",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190802Z-2d1529",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-59acdf",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-4b87a2",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-5e8969",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        