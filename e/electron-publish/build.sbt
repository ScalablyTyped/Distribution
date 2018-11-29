organization := "com.scalablytyped"
name := "electron-publish"
version := "20.38.0-4c0c85"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "7zip-bin" % "4.1.0-7ec5a8",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "app-builder-bin" % "2.5.5-4e9470",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.6-98debd",
  "com.scalablytyped" %%% "builder-util" % "9.5.0-fd078a",
  "com.scalablytyped" %%% "builder-util-runtime" % "8.0.2-b49704",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-748b3b",
  "com.scalablytyped" %%% "fs-extra-p" % "7.0.0-c19546",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-032e5f",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-d82200",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-e0b0d4",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-56237b",
  "com.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-c178cf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "temp-file" % "3.3.2-dda542",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        