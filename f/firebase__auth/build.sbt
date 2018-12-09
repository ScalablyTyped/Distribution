organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.9.0-c8f635"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-cb525f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-2f786b",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-8fc773",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-f6e00f",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        