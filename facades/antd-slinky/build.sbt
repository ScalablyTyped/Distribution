organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201907271058-4a33a8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-3e79d4",
  "org.scalablytyped" %%% "antd" % "3.23.5-fb82da",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "moment" % "2.24.0-4e4a5b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-ad75a1",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-1a3b75",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-83c539",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        