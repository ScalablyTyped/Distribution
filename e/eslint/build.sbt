organization := "org.scalablytyped"
name := "eslint"
version := "4.16-dt-20181203Z-21d841"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-8cc4ab",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-2d8a40",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        