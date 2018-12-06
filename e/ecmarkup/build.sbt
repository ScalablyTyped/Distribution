organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-2cb3af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-571405",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-789ce0",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-8ca28c",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-609bd8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180910Z-dd9674",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180910Z-ecf245",
  "org.scalablytyped" %%% "prex" % "0.4.3-ed8866",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        