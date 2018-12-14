organization := "org.scalablytyped"
name := "electron-publish"
version := "20.38.3-6e5692"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-bc7118",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-db1a71",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-28c29e",
  "org.scalablytyped" %%% "builder-util" % "9.6.0-88184d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-67427d",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b30a1d",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-3a9571",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-06d10e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-d9abb6",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-5d16f0",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-0b63f6",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-ee6f2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        