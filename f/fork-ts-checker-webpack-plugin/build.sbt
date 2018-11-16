organization := "com.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.4.14-3a1ae3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20181102Z-747818",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20181102Z-1ab20f",
  "com.scalablytyped" %%% "builtin-modules" % "2.0-dt-20181102Z-10a255",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20181102Z-1e4973",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "commander" % "2.19.0-5a68a9",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-5885f0",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20181102Z-0a1057",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20181102Z-895b36",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20181102Z-28ea11",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20181102Z-92c73a",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "tslint" % "5.11.0-9921f8",
  "com.scalablytyped" %%% "tsutils" % "2.29.0-7b895c",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        