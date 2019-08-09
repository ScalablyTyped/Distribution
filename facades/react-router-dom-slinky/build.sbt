organization := "org.scalablytyped"
name := "react-router-dom-slinky-facade"
version := "201907271058-44da2d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-796a7a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-2b0413",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190613Z-85bcbe",
  "org.scalablytyped" %%% "react-slinky-facade" % "201907271058-a21c9e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        