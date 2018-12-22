organization := "org.scalablytyped"
name := "gcp-metadata"
version := "0.7.0-7e2c40"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-51eacb",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a292c4",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-767513",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7f5478",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        