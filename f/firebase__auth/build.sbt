organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.9.2-c6dfd9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-e62e9f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-c894b1",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.1-f1ac1f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-940c18",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        