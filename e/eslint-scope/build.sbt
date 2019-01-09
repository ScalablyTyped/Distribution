organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-a7f8c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20181202Z-6e78c4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-6acda2",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-325b81",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        