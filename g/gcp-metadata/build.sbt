organization := "org.scalablytyped"
name := "gcp-metadata"
version := "0.7.0-50ac81"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d01cc1",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-a5898c",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-bd7bd3",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        