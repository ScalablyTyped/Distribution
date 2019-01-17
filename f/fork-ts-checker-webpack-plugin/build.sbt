organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-b3eb03"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-09ec76",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-c9eb3a",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-99e1c8",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-018fca",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-c4aa11",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "commander" % "2.19.0-69af0a",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-cf9880",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-06ecaa",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-5cbd31",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-c19eb0",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6f52c3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-db8d14",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "tslint" % "5.12.1-1d6d10",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-c2fe1d",
  "org.scalablytyped" %%% "typescript" % "3.2.2-65de7b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-11a316",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-559b24")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        