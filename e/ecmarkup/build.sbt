organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-c28074"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-a67bbf",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20190322Z-a77bd9",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-6c04b8",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190228Z-34a47c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20190322Z-3a5bca",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-a5e2e1",
  "org.scalablytyped" %%% "prex" % "0.4.5-3e3b35",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        