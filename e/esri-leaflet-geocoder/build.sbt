organization := "org.scalablytyped"
name := "esri-leaflet-geocoder"
version := "2.2-dt-20180214Z-f80a4e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esri-leaflet" % "2.1-dt-20191014Z-bd4f7b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-f488cd",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20191203Z-ca609b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        