organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-f78c46"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d73b57",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-aa56af",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-578732",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-8b8449",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "commander" % "2.19.0-b52167",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-4b83ac",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-493cc6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3cef84",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-8e5b9d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-59c854",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "tslint" % "5.13.1-903e09",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-b4b0da",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-4f8c7c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-8cc2d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        