organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180910Z-711fae"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-32ac72",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-cd750f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-69f97e",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-b9f684",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-8d214e",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-1eafcc",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-eb92da",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-83b55f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-cff33c",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        