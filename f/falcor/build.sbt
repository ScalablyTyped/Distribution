organization := "org.scalablytyped"
name := "falcor"
version := "0.1-dt-20190212Z-366d1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-0fee3d",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-6e11bd",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        