organization := "org.scalablytyped"
name := "electron-builder"
version := "20.39.0-425bce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-ae6b3f",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-5b3bdf",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-6bfc8f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-2ef8e1",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-25fbe5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-fa028f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-120670",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "dmg-builder" % "6.6.0-9defde",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-9016dd",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-c07106",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-c20989",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-704239",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-5137fa",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-5a56d5",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-bb687c",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-7f61fb",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-98f015",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-d085df",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-575b94",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-71761f",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-9009e1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d709de",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-2262ad",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "read-config-file" % "3.2.2-9f18b4",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-ba04b2",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-23aff6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-2d4447",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-a2e272",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-6e0556",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-cc339e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-7896d1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190317Z-d1d847")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        