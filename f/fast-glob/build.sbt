organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.6-ab6d7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-57b73f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-24e045",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2e5f61",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-8f2994",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-493cc6",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-3c7beb",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-6964e5",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        