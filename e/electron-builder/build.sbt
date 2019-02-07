organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.5-f9cf27"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-7fd281",
  "org.scalablytyped" %%% "ajv" % "6.8.1-17ddd9",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-94ad9b",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-be5e48",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-6b9b17",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-9deb1a",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-a14d53",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-964a6f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-4d2e54",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-048d4d",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-54cdd6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-18ad8e",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.4-912f0e",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-d6d56a",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-bd88ec",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-945834",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-b67636",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-196f32",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2cff45",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-948114",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-478975",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-78b0db",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-17c7d4",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-2ab72d",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-c8d096",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9bda5b",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-788dbc",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-128daa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-850695",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-47c210",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0009b8",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-f944c4",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-fdf29d",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-316df6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-c6e9be",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-e0c4f9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-0ba55c",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-68f38f",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-194416",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-b7a701",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-31d9dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        