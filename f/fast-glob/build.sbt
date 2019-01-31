organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-e474c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-035447",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-208c35",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-a8ae1f",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-bb2fb4",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-5258d8",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-a90da7",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-6a6085",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-538c83",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        