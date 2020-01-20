organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "202001181046-a0296f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-6ac84e",
  "org.scalablytyped" %%% "antd" % "3.26.7-2bd8bb",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1161bc",
  "org.scalablytyped" %%% "moment" % "2.24.0-911107",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ecff2c",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-2ec268",
  "org.scalablytyped" %%% "rc-menu" % "7.5.4-697359",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-b04669",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-2f08ea",
  "org.scalablytyped" %%% "react-slinky-facade" % "202001181027-8b52a3",
  "org.scalablytyped" %%% "std" % "3.7-447fe9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        