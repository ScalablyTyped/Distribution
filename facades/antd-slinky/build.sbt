organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "201910050724-59f45c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-913548",
  "org.scalablytyped" %%% "antd" % "3.23.6-f172ad",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "moment" % "2.24.0-3909a2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-c057de",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-900d6b",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-8e8f74",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        