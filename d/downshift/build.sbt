organization := "org.scalablytyped"
name := "downshift"
version := "3.2.2-252b26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "compute-scroll-into-view" % "1.0.11-243d8a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-is" % "16.7-dt-20190128Z-19071b",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        