organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.7-9127cd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-ddb776",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-dfb38e",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-e6f0f4",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-0df987",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-a1c12c",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        