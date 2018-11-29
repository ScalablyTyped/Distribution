organization := "com.scalablytyped"
name := "ecmarkup"
version := "3.16.0-3cc78c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "grammarkdown" % "2.0.11-821f62",
  "com.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-d77ff9",
  "com.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-2a9bdb",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-99d6fa",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180910Z-8d21c8",
  "com.scalablytyped" %%% "parse5" % "5.0-dt-20180910Z-817763",
  "com.scalablytyped" %%% "prex" % "0.4.3-d962ea",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        