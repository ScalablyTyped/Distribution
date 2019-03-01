organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-c78da0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-70b19f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-dfeccf",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-8da10c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        