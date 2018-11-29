organization := "com.scalablytyped"
name := "fast-glob"
version := "2.2.4-938c76"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-186a8c",
  "com.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-2d7328",
  "com.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-a782e3",
  "com.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-ca9612",
  "com.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-dc986c",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-50c51c",
  "com.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-5df7d2",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-ea9102",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        