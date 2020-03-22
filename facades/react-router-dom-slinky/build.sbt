organization := "org.scalablytyped"
name := "react-router-dom-slinky-facade"
version := "202002160131-850522"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-b605ef",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200212Z-ce4a9c",
  "org.scalablytyped" %%% "react-router-dom" % "5.1-dt-20191125Z-d552d5",
  "org.scalablytyped" %%% "react-slinky-facade" % "202002160131-04b05e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
