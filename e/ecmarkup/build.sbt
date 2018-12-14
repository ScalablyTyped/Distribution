organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-e2d03d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-f16573",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-767440",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-e7afbd",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-34b199",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180910Z-f09733",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180910Z-82d296",
  "org.scalablytyped" %%% "prex" % "0.4.5-1c609a",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        