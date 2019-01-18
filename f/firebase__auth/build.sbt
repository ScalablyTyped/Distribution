organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.9.1-775d57"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.7-3b917f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-99e1ce",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-b172c0",
  "org.scalablytyped" %%% "firebase__util" % "0.2.5-940c18",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        