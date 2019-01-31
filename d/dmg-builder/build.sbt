organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.5.4-f1795e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-825499",
  "org.scalablytyped" %%% "ajv" % "6.7.0-3699e1",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-2cd20d",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-fbb6cc",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-ac7bc8",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-da6846",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-a0ab12",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-960e73",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-bd1021",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-52ab1b",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-6afd7b",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-261623",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-764f74",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ceddfc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-601dd9",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-de50bb",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-6e7b88",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-b4d555",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-c77ed0",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-5071d9",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-8bc5c9",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-8c7f39",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-b9e391",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-8d7875",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-a6b836",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6755f9",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-4b5ae6",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-4aae76",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-4d28ec",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a1b80c",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-0c8da4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-2a4752",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-c4241a",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-517132")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        