organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.2-c98029"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.41.0-fbf421",
  "org.scalablytyped" %%% "builder-util" % "10.0.0-d8bafb",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.2-283506",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-da708a",
  "org.scalablytyped" %%% "electron-publish" % "20.41.0-b21e6d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-441a04",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-e0982f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        