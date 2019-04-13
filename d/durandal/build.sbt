organization := "org.scalablytyped"
name := "durandal"
version := "2.1.0-dt-20190322Z-d3b1f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-45cee7",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190412Z-2a6c06",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-dae54d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        