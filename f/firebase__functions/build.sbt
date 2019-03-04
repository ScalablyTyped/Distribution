organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.4.0-ab018b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.10-d752dc",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-8b6709",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.0-b58d1f",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.6-c61b6f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.8-84fe78",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-862ffd",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        