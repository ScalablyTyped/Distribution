organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180910Z-2813e8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20181203Z-a8f669",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180910Z-f63ddc",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-f46d58",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        