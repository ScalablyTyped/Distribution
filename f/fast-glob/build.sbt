organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-eebf55"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-869c0d",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-0a374c",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-02a77e",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-628014",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-a8634b",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-f1da2a",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-c86a24",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-972a82",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        