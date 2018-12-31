organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-a3f521"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20181202Z-b917d5",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-80340d",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-8d9f36",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        