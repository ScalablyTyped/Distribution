organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-db7e9d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-287a9a",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-511857",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-b12877",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-2a58a5",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-51e43c",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-31fb04",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-a13237",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-96cf42",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        