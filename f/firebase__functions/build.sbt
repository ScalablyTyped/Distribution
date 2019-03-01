organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.7-724f46"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-a9c13f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-55bcac",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-8f85a0",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-01f607",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-78674a",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-06f74b",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        