organization := "org.scalablytyped"
name := "dynmap"
version := "3.1-dt-20220712Z-876a68"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-feb617",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-b1ee87",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
