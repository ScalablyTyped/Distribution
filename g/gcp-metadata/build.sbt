organization := "org.scalablytyped"
name := "gcp-metadata"
version := "1.0.0-dd41b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-539472",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-5c9ccd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-c776cb",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-88a938",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        