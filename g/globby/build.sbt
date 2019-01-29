organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-901367"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-ae4be4",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-7b97b3",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-2b6028",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-4a762a",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-77cbaa",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-7ceed9",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-8fe84b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-15af2a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-d2eaa3",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        