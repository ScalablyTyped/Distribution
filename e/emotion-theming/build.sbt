organization := "org.scalablytyped"
name := "emotion-theming"
version := "10.0.10-ab8e84"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-ea461f",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-bd1d18",
  "org.scalablytyped" %%% "emotion__css" % "10.0.9-3572c2",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-94b869",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-3ea7b2",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-544bfc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-2833ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        