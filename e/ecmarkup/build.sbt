organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-2d15dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-73bb22",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-82c9f8",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-b36296",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-06ecaa",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-654bce",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-33d02e",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-0c3e07",
  "org.scalablytyped" %%% "prex" % "0.4.5-a1b8ff",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        