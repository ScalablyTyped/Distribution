organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.13-5eed28"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.10-d752dc",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-8b6709",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.6-365aad",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.7-4d839b",
  "org.scalablytyped" %%% "firebase__util" % "0.2.8-84fe78",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        