organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201908100907-faf658"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-900406",
  "org.scalablytyped" %%% "antd" % "3.23.2-cc3e16",
  "org.scalablytyped" %%% "csstype" % "2.6.6-d2dd63",
  "org.scalablytyped" %%% "moment" % "2.24.0-73dd14",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-b412db",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-45b305",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-076e3c",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-98a10f",
  "org.scalablytyped" %%% "react-slinky-facade" % "201908231208-4c5101",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        