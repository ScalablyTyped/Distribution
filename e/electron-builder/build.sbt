organization := "org.scalablytyped"
name := "electron-builder"
version := "20.39.0-b3cce4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-0f078b",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7799d3",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-22a489",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-50f1c7",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-89d29c",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-dd14e1",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-de10ea",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20190322Z-f6ca46",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "dmg-builder" % "6.6.0-974548",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-cf6970",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-b284fc",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-f0fddd",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-3c2667",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-89ecfe",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cbad63",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6662de",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-cff3d2",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-503c5a",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-7bc28f",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-10ff31",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-fc06f9",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20190322Z-64b371",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-678c2e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-4bff31",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b8cb48",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6f3a8b",
  "org.scalablytyped" %%% "read-config-file" % "3.2.2-156f9f",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20190322Z-198ed2",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-2d2484",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-7c13c5",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-120589",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-263b9a",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-00f9aa",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-d68e3d",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20190322Z-5375ea",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190317Z-82dec3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        