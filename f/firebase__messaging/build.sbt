organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.15-8208a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.13-cc9702",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.7-04850d",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.8-929eb4",
  "org.scalablytyped" %%% "firebase__util" % "0.2.11-546759",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        