organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-be1635"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-8a1d90",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-26bbcd",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-b1c925",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-fd75d1",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-a7543b",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-b156aa",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-fdb1c0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-42fcd1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-4f2286",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        