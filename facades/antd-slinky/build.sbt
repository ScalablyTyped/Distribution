organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201910050724-a9223e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-75d968",
  "org.scalablytyped" %%% "antd" % "3.23.6-326398",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "moment" % "2.24.0-376d78",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-41f3c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-0544da",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-53e1ba",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        