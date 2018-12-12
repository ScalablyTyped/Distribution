organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.7-d674d8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-f5c7a1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-8d890d",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-460868",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-ec9c8e",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        