organization := "org.scalablytyped"
name := "eslint"
version := "4.16-dt-20181202Z-cfb5f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-7a3151",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-46ddbc",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        