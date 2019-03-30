organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20190212Z-79d9a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190322Z-300397",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-84f733",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-86a92a",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-5525e1",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        