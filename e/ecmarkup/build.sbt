organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-fd0edb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-8cb253",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-911ef5",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-8085bb",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-67ede6",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-d8f036",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-ddd17d",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-37a4d8",
  "org.scalablytyped" %%% "prex" % "0.4.5-f64c93",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        