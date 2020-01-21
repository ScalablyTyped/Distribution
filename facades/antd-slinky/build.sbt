organization := "org.scalablytyped"
name := "antd-slinky-facade"
version := "202001200646-68aeb3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-4b0379",
  "org.scalablytyped" %%% "antd" % "3.26.7-9387a3",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "moment" % "2.24.0-73a0d6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-e4d644",
  "org.scalablytyped" %%% "rc-menu" % "7.5.4-1001c6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-b12674",
  "org.scalablytyped" %%% "react-slinky-facade" % "202001200646-9927c3",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        