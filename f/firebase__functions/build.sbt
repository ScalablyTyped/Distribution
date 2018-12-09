organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.3-ec4e0c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-cb525f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-2f786b",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-7f689d",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-3910bd",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-f6e00f",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-70f06b",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        