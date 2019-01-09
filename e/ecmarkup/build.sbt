organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-d2de25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-7e1e36",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-a0c417",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-bea7a1",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-3d9c80",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-fc8c13",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-c00f9a",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-0c58ef",
  "org.scalablytyped" %%% "prex" % "0.4.5-43e091",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        