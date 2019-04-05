organization := "org.scalablytyped"
name := "elastic-apm-node"
version := "2.8.0-26f57c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "basic-auth" % "1.1-dt-20180214Z-f266b6",
  "org.scalablytyped" %%% "console-log-level" % "1.4-dt-20180724Z-b66a20",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20181113Z-c85bbb",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-e9dda0",
  "org.scalablytyped" %%% "fast-safe-stringify" % "2.0.6-a09408",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-c6ba0e",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        