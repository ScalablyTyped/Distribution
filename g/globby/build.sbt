organization := "com.scalablytyped"
name := "globby"
version := "8.0-dt-20180910Z-ba5f04"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-59c475",
  "com.scalablytyped" %%% "fast-glob" % "2.2.3-6b17b3",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-be6708",
  "com.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-fc9c19",
  "com.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-903de7",
  "com.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-dbd7c1",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-c8a677",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-4266fa",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.2-125022",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        