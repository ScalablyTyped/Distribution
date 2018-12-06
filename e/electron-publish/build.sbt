organization := "org.scalablytyped"
name := "electron-publish"
version := "20.38.2-aea1c0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-94bfa2",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-57107f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-edd0bc",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-191b5f",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.0.2-0a1039",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-cc8eb7",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-731c00",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-c2b0d7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-fcb303",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-762bad",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-ab37b2",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-25b105")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        