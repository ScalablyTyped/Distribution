organization := "org.scalablytyped"
name := "gcp-metadata"
version := "0.7.0-5b44b4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-cf4236",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-120804",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-080f7f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-8377fd",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        