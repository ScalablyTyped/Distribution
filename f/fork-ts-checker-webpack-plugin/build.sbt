organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.1-f36a42"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-3370a7",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-c36f61",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-287a9a",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-a68bcd",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-97e53c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "commander" % "2.19.0-cf4cd1",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-eeb72f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b7b8a8",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-31fb04",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-6c3e31",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6ade85",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-a6cca8",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "tslint" % "5.11.0-9bad75",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-b5594c",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3c1589",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-1c8cd5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        