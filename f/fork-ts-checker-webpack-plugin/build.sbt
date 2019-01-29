organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-5f8a90"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-3be82b",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-7f4f95",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-ae4be4",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-5bd474",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-1a6d3e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "commander" % "2.19.0-13b951",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190121Z-ec63f0",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-8bc5c9",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-8fe84b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-1d69c8",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-1d4d44",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "tslint" % "5.12.1-16f6c0",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-9e4ceb",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-280313",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-eb1462")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        