organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.0-409760"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-248c45",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-9eef91",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-08429b",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-9a4314",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-ac28f3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "commander" % "2.19.0-5e90f1",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0025b6",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-df9d30",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-98a713",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-c36488",
  "org.scalablytyped" %%% "source-map" % "0.7.3-faaeaa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-3b1759",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "tslint" % "5.11.0-210aee",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-a1a877",
  "org.scalablytyped" %%% "typescript" % "3.2.1-a03537",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d2faab",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-cc64d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        