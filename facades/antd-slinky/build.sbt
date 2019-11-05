organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201910310431-92c44d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-2d09d5",
  "org.scalablytyped" %%% "antd" % "3.25.0-5daf41",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "moment" % "2.24.0-3909a2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.1-8afaa5",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-bf8f7f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-292eed",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-1c546a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        