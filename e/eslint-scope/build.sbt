organization := "com.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20181102Z-99e398"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "eslint" % "4.16-dt-20181102Z-80c465",
  "com.scalablytyped" %%% "estree" % "0.0-unknown-dt-20181102Z-983838",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20181102Z-cfe007",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        