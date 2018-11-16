organization := "com.scalablytyped"
name := "firebase__database"
version := "0.3.6-415eac"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-db0e33",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-47cf25",
  "com.scalablytyped" %%% "firebase__database-types" % "0.3.2-ab43c4",
  "com.scalablytyped" %%% "firebase__logger" % "0.1.1-f202e2",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-755c3b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        