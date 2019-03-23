organization := "org.scalablytyped"
name := "falcor-router"
version := "0.4.0-dt-20190322Z-413c34"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-50dcec",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-b7cdc8",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-aee3ce",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        