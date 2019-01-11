organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-ffcd03"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-99e1c8",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-3471ce",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-8f1e1e",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-e8e194",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-22bd96",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-5cbd31",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-28a727",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-d038e9",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        