organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-d88055"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-24af50",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-32a2f2",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-777de3",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-1492b0",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-23da3e",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-3bbaea",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-43713a",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-ab6d89",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-63d449",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-b5197c",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        