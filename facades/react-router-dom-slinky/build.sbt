organization := "org.scalablytyped"
name := "react-router-dom-slinky-facade"
version := "202001181030-fff32c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1161bc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-20c95b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ecff2c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-b04669",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200114Z-11507a",
  "org.scalablytyped" %%% "react-router-dom" % "5.1-dt-20191125Z-a56aa8",
  "org.scalablytyped" %%% "react-slinky-facade" % "202001181027-8b52a3",
  "org.scalablytyped" %%% "std" % "3.7-447fe9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        