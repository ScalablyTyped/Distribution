organization := "org.scalablytyped"
name := "dynmap"
version := "3.1-dt-20220712Z-11046e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c21ab7",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-20efda",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-9d848a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-224716",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
