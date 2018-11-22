organization := "com.scalablytyped"
name := "documentdb-session"
version := "1.0-dt-20180910Z-39f0ba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-69217a",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-ffa116",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-673f92",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-b9e3b3",
  "com.scalablytyped" %%% "express-session" % "1.15-dt-20180910Z-5d495f",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-8d9c98",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        