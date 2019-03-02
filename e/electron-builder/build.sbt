organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.5-d12ab3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-fe028e",
  "org.scalablytyped" %%% "ajv" % "6.9.2-824407",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-d8753f",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-49946e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-8afb8f",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-4e8de5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-b0731f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-4a5a10",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.4-b1cc3a",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-f588bb",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-2ff259",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2ce286",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-099844",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-58dad5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-598466",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-cb3aae",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-b5d1c1",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-25d991",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-a154d6",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-3fef18",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-81375c",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-970eae",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-60893a",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-94d367",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-0affdf",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-5c5b32",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-8067d6",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-268218",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-d7f378",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-efb777",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-550bfd",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-099ae6",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-298117",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-4b6ee3",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-3b51ba",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-dbed83")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        