organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-ab03e0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-99f581",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-508801",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-bebe09",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-719ca7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180910Z-e92966",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180910Z-ced19d",
  "org.scalablytyped" %%% "prex" % "0.4.5-91f3f0",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        