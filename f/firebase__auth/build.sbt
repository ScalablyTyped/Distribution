organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.9.2-c1b9e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-c8dd09",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-6735a2",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.1-01cd17",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-051cad",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        