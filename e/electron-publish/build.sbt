organization := "org.scalablytyped"
name := "electron-publish"
version := "20.38.3-a97eb1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-4f7da1",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-d18151",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-95ab1e",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-9f9dfb",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-870d5f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-31009f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-7d565d",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-af4281",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-0bc3ab",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-dc40c5",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-5b8a80",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-77ab9d",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-a92d08")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        