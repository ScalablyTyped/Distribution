organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-faa743"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-250fb3",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-0ec5cf",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-62068e",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        