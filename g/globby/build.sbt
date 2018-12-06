organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180910Z-6bf63f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-08429b",
  "org.scalablytyped" %%% "fast-glob" % "2.2.4-581af1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-2c128f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-7f878e",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-540a0e",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-fc8336",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-df9d30",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-9054f9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-3bd147",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        