organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909200330-5383a4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-63837b",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-3b10ab",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-21c421",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191028Z-c727db",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-8df7d9",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-891ceb",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-5e41e3",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-0db95d",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-c8013d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        