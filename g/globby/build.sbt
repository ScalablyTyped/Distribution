organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-07e9ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d5ee42",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-e209f1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-6d8e03",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-43ec4b",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-0da436",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-81ee65",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-94c9f5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-a455bf",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-1cbb35",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        