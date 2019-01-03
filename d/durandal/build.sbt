organization := "org.scalablytyped"
name := "durandal"
version := "2.1.0-dt-20181015Z-72b68a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d3df4",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-014288",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-f7ab30",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        