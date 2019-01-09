organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.5.3-1c3556"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-64e7b6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-80a59c",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-3c4a03",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.4-d4543f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-8b7314",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-8e6e0f",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-b2d7cb",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-373ac9",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-3a6aaa",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-5f5375",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-f7656e",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-afd90e",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-9a3785",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-fda359",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-d4ee71",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-41febd",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-2c98f8",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-2059c4",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-3d9c80",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-9ad826",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-5da1b4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-133aeb",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-141fa1",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-7a79c0",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-e6e649",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-2a8fc0",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-4d0b7b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a3e4d1",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-1b4238",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-4ed47c",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6a758d",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-bc95b7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        