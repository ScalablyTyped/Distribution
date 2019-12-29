organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201912040132-66c0a1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-e994ca",
  "org.scalablytyped" %%% "antd" % "3.26.4-967eee",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "moment" % "2.24.0-8ebd48",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-ac4d5d",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-b3bcbe",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-819991",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-ba5e8b",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        