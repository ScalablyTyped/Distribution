organization := "org.scalablytyped"
name := "electron-builder"
version := "20.44.4-e900b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.44.4-13b4f7",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-34fdc2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-d96d97",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-9902a3",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-75e2af",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-67a502",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-806fa0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "temp-file" % "3.3.3-92f2eb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        