organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.0-c11cf4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-2393db",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-3a9366",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-a966c4",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-55a535",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-b70c50",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-c023d3",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20190322Z-91ef7c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-1aa814",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-d02394",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2916f6",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-b05352",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-dc4c54",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-a8786c",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-f4853c",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-72e802",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-9813e6",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-9b420a",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-0fef76",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-bb4a1b",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20190322Z-f9fe84",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-eeaaa8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b39d20",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "read-config-file" % "3.2.2-14f331",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20190322Z-189ab8",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-d98f7b",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-1843b4",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-eadfcf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-3a33f8",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20190322Z-ff2724")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        