organization := "org.scalablytyped"
name := "electron-publish"
version := "20.39.0-cc7ffe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-f8f859",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-7d00fb",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-bc840e",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-9f9e9e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-5ee1d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        