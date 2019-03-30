organization := "org.scalablytyped"
name := "falcor-router"
version := "0.4.0-dt-20190322Z-bfa581"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-a0f305",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-c30718",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-4a47cc",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        