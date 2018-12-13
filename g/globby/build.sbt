organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180910Z-0663ea"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-287a9a",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-30730c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b7b8a8",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-511857",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-b12877",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-2a58a5",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-0598e1",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-31fb04",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-7db915",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-06ce37",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        