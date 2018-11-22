organization := "com.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.4.10-7d7a88"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-335bc8",
  "com.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-9b1438",
  "com.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-a766ae",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-347dbd",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "commander" % "2.19.0-3dc169",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-9d1bfa",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "lodash_dot_endswith" % "4.2-dt-20180910Z-92146f",
  "com.scalablytyped" %%% "lodash_dot_isfunction" % "3.0-dt-20180910Z-0a3262",
  "com.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-d0342e",
  "com.scalablytyped" %%% "lodash_dot_startswith" % "4.2-dt-20180910Z-2dbae0",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-097390",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-eae856",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-aab6b2",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "tslint" % "5.11.0-fca634",
  "com.scalablytyped" %%% "tsutils" % "2.29.0-f21c88",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3bc20d",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-24e8e4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        