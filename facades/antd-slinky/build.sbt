organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201912040132-434e8b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-ce13bd",
  "org.scalablytyped" %%% "antd" % "3.26.7-9c0035",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "moment" % "2.24.0-d25a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-7ea273",
  "org.scalablytyped" %%% "rc-menu" % "7.5.4-0c24f9",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-462bed",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-b72fb0",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        