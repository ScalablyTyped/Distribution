organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.0-220d78"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-5af0d9",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-eea192",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-32ac72",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-b6f3d2",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-34f74c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "commander" % "2.19.0-d3bb02",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-7260ba",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-eb92da",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-a5b827",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-9fb0f3",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890",
  "org.scalablytyped" %%% "tslint" % "5.11.0-48c493",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-016148",
  "org.scalablytyped" %%% "typescript" % "3.2.2-fe9cc4",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-961fa8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        