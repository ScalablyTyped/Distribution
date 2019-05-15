organization := "org.scalablytyped"
name := "electron-builder"
version := "20.40.2-a37b10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.40.2-c0abe2",
  "org.scalablytyped" %%% "builder-util" % "9.7.1-bb55ec",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.1-466e38",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-da708a",
  "org.scalablytyped" %%% "electron-publish" % "20.40.0-4462a5",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-212869",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-e0982f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        