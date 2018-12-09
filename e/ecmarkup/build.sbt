organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-60d730"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-0e9281",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-df705d",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-672f23",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-104689",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180910Z-37c917",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180910Z-787837",
  "org.scalablytyped" %%% "prex" % "0.4.5-a3f27f",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        