organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.7-e3761c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-549c81",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-7c079d",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-1c156e",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-aaaf15",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-051cad",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-292775",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        