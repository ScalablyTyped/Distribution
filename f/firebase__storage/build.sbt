organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.14-825111"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.9-3c992f",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.10-ed4df4",
  "org.scalablytyped" %%% "firebase__util" % "0.2.13-c27e2e",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        