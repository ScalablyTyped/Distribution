organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.6-8d8f96"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-5f9447",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-5e947e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-9382e4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        