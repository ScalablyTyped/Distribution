organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-0f508f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-49478c",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20190322Z-f8c554",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-89b081",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-bb4a1b",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190228Z-7b56f0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20190322Z-95480d",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-a8ab65",
  "org.scalablytyped" %%% "prex" % "0.4.5-776e86",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        