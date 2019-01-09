organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.3-86c042"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-42f1fc",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-baa260",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-bc412c",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-43ed67",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-0581ca",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-27deba",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        