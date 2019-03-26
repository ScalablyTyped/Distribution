organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.6-c24471"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-7fa312",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-f2c726",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-26f135",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-35474d",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-361ba9",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-78c499",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-08c936",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-3a21ff",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        