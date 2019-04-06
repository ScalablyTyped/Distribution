organization := "org.scalablytyped"
name := "emotion__cache"
version := "10.0.9-f9412f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-a7f9c3",
  "org.scalablytyped" %%% "emotion__stylis" % "0.8.3-4bdcd9",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-255ee0",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        