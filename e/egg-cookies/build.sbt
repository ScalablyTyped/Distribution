organization := "org.scalablytyped"
name := "egg-cookies"
version := "2.2.6-12459d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20190322Z-616506",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e16d89",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20190322Z-184de5",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility" % "1.16.1-af390d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        