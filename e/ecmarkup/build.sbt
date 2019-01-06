organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-32fbb8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "chalk" % "2.4.2-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-ef278c",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-42b8d3",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-3bf600",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-59bec3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-0fa223",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-6784c3",
  "org.scalablytyped" %%% "prex" % "0.4.5-052aee",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        