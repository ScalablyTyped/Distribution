organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-1a5e96"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-94ad9b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "chalk" % "2.4.2-4d2e54",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-048d4d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-385e7c",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-49de3d",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-b2d4d0",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9bda5b",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190117Z-75f407",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-322246",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-f43960",
  "org.scalablytyped" %%% "prex" % "0.4.5-932878",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        