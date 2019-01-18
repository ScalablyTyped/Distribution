organization := "org.scalablytyped"
name := "falcor"
version := "0.1-dt-20180214Z-8b7c26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20180214Z-e5d778",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20180214Z-eaa5c4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        