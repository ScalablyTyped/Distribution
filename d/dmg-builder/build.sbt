organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.2-b7834c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.41.0-e6e7da",
  "org.scalablytyped" %%% "builder-util" % "10.0.0-2a955a",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.2-70ee1e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-3517db",
  "org.scalablytyped" %%% "electron-publish" % "20.41.0-1068ec",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-04f73b",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-a3db3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-372092")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        