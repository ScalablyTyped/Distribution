organization := "org.scalablytyped"
name := "esri-leaflet-geocoder"
version := "2.2-dt-20180214Z-ac190e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "esri-leaflet" % "2.1-dt-20181017Z-027034",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-038c51",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190130Z-e6e0b7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        