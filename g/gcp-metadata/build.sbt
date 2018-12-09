organization := "org.scalablytyped"
name := "gcp-metadata"
version := "0.7.0-8dc964"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-059ef2",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-6e554f",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7081db",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        