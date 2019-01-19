organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.5-ccf66d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-825499",
  "org.scalablytyped" %%% "ajv" % "6.7.0-3699e1",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-2cd20d",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-6e731d",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a8dc26",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-86df11",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-8cb09d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-2b2741",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-960e73",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.4-3b6fa6",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-4d2dff",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-52ab1b",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-6afd7b",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-8059a5",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-997bf3",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ceddfc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-3bc3c3",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-24020e",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-6e7b88",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-7f27d1",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-c77ed0",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-a5800a",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-8bc5c9",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-8c7f39",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-b9e391",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-8d7875",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-80be6e",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6755f9",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-f9d7a9",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-4aae76",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2af35f",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-113222",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-0c8da4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-03ab48",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-742136",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-c4241a",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-517132",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-e28795")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        