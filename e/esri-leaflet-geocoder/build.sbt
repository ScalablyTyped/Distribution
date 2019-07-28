organization := "org.scalablytyped"
name := "esri-leaflet-geocoder"
version := "2.2-dt-20180214Z-b9a5ce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esri-leaflet" % "2.1-dt-20181017Z-f42e75",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-8b8d4c",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20190726Z-14695c",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        