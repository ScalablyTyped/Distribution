organization := "org.scalablytyped"
name := "electron-publish"
version := "20.39.0-89ecfe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-0f078b",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-22a489",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-89d29c",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-dd14e1",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-de10ea",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6662de",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-cff3d2",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-10ff31",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-678c2e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-2d2484",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-7c13c5",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-120589",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-263b9a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        