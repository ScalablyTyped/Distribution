organization := "org.scalablytyped"
name := "electron-builder"
version := "21.2.0-541ca6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-93d054",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-85196b",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-1cf8fe",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-2dc91b",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-1203e0",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-03a464",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-8963f5",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-fa65c4",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-0a7d60")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        