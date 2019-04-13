organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.18-eeb0f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.8-38852e",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.9-d42379",
  "org.scalablytyped" %%% "firebase__util" % "0.2.12-c27e2e",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        