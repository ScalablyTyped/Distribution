organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-40c530"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-052e82",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "chalk" % "2.4.2-273699",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-1f537b",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-786422",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20190322Z-f4f8b6",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-36c82d",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190228Z-5a30d1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20190322Z-4a2ab5",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-efa5ba",
  "org.scalablytyped" %%% "prex" % "0.4.5-3f630a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        