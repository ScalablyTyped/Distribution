organization := "org.scalablytyped"
name := "antd-native-slinky-facade"
version := "201909200330-2b9b74"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-native" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__icons-react-native" % "1.0.2-92a66c",
  "org.scalablytyped" %%% "ant-design__react-native" % "3.2.0-dfc5b7",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-27dcf1",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-a0fb20",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-489a4b",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-9203c1",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-bf1598",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-4a8faf",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-cfc9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        