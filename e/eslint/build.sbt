organization := "com.scalablytyped"
name := "eslint"
version := "4.16-dt-20181027Z-99c896"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-4463bc",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-055e3d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        