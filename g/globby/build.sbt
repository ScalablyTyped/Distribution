organization := "com.scalablytyped"
name := "globby"
version := "8.0-dt-20180910Z-6b8a80"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-59c475",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fast-glob" % "2.2.3-7b7fdd",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-5d44f9",
  "com.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-be6708",
  "com.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-fc9c19",
  "com.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-903de7",
  "com.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-23ba82",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-c8a677",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-c82288",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.2-4086c7",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        