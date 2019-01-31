organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "0.5.2-d62d47"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-92d399",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-8cbf2c",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-035447",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-29365e",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-3de748",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "commander" % "2.19.0-131eaa",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190121Z-a5f8f5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-00b149",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6e1cbe",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-a90da7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-508cae",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-3bfc94",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848",
  "org.scalablytyped" %%% "tslint" % "5.12.1-13a639",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-842e99",
  "org.scalablytyped" %%% "typescript" % "3.3.1-b7b6b0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-faabb7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-9d8df8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        