organization := "com.scalablytyped"
name := "globby"
version := "8.0-dt-20181102Z-832512"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20181102Z-1ab20f",
  "com.scalablytyped" %%% "fast-glob" % "2.2.3-5c4a7e",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "glob-parent" % "3.1-dt-20181102Z-c5b81c",
  "com.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20181102Z-51dbe3",
  "com.scalablytyped" %%% "is-glob" % "4.0-dt-20181102Z-8a9554",
  "com.scalablytyped" %%% "merge2" % "1.1-dt-20181102Z-6627dc",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20181102Z-895b36",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-b08999",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-4039db",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        