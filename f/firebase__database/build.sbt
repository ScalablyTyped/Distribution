organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.14-ff77d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.11-674642",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-553dd3",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.6-8e2395",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.8-3db2dc",
  "org.scalablytyped" %%% "firebase__util" % "0.2.9-546759",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        