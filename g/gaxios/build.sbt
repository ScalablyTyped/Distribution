organization := "org.scalablytyped"
name := "gaxios"
version := "1.8.0-9b91bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-9b5c01",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-1e70dd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-e0af3f",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-da59e9",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        