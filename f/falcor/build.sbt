organization := "org.scalablytyped"
name := "falcor"
version := "0.1-dt-20180910Z-531e78"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20180910Z-fdbb07",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20180910Z-72dddf",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        