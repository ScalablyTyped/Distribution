organization := "org.scalablytyped"
name := "electron-builder"
version := "20.40.2-d6950f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.40.2-24c539",
  "org.scalablytyped" %%% "builder-util" % "9.7.1-654b11",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.1-b56b1a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-da708a",
  "org.scalablytyped" %%% "electron-publish" % "20.40.0-cd9e32",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-a785dc",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-e0982f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        