organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-d7c6fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-c183c0",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-ba1d51",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-869c0d",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-6859fc",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-cdc05c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "commander" % "2.19.0-12e126",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-4cfaa6",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-3d9c80",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-f1da2a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-563e19",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-e50996",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19",
  "org.scalablytyped" %%% "tslint" % "5.12.1-e40c73",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-b5a7fd",
  "org.scalablytyped" %%% "typescript" % "3.2.2-12aee5",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-bd0e3f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-f6f4be")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        