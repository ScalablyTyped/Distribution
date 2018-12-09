organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180910Z-a90e3a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20181203Z-29d19f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-8c7819",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-1aaea6",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        