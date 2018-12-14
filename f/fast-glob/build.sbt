organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-a16e1c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-798c77",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180910Z-e08b7f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180910Z-03a2e3",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180910Z-ea4a35",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180910Z-2cafbd",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-282d54",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-aa0cab",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-3dac01",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        