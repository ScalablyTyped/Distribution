organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.5-21bc6e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-422126",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-9c42be",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-facf5e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-7ee39d",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-a90025",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-48e1b7",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-c75069",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.4-5bafe9",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-751763",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-fb6302",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-ba5715",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-d27750",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-ce42fc",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-811058",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-b2f055",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-5e3708",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-2b4da7",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-ded1c2",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-4e3d47",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-9c8115",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-26f46d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-c130fb",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-9a4af5",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-d19626",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-17a104",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-46c2c8",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-6bff05",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-b141fd",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-9f398b",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-a13134",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-2c8be0",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-2f6d0e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        