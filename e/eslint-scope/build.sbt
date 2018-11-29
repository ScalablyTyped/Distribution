organization := "com.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180910Z-75cb33"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "eslint" % "4.16-dt-20181027Z-b88e66",
  "com.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-280628",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-ba0128",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        