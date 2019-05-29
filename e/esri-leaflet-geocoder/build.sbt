organization := "org.scalablytyped"
name := "esri-leaflet-geocoder"
version := "2.2-dt-20180214Z-fc0afb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "esri-leaflet" % "2.1-dt-20181017Z-a5b025",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-9c6dd8",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-1a3ac8",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        