organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.11-fad15b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-e62e9f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-c894b1",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.4-22142a",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.5-1b0e66",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-940c18",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        