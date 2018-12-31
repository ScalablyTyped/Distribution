organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-e30504"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-e20eff",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-465e28",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-f2c1f2",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-2a2ba1",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b06515",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-45865a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "commander" % "2.19.0-30fe69",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-47e6cf",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-0ba963",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-5fd60a",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48ad47",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d",
  "org.scalablytyped" %%% "tslint" % "5.12.0-c465e2",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-75e175",
  "org.scalablytyped" %%% "typescript" % "3.2.2-aeda64",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8b616d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-bcc5d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        