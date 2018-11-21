organization := "com.scalablytyped"
name := "firebase__auth"
version := "0.7.8-fd41a2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "firebase__app" % "0.3.4-1508e1",
  "com.scalablytyped" %%% "firebase__app-types" % "0.3.2-254ba4",
  "com.scalablytyped" %%% "firebase__auth-types" % "0.3.4-299bb4",
  "com.scalablytyped" %%% "firebase__util" % "0.2.2-45bc2d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        