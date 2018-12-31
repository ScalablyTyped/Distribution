organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-4d949d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-f2c1f2",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-c4df46",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-229704",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-554ea9",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-1b1a67",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-6e0395",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-0ba963",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-a0bafa",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-d5438c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        