organization := "org.scalablytyped"
name := "falcor-http-datasource"
version := "0.1.3-dt-20180214Z-c86bcc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20180214Z-187662",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20180214Z-936074",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        