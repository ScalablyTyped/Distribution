organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.10-7ef6b9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.11-674642",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.5-553dd3",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.6-f07674",
  "org.scalablytyped" %%% "firebase__util" % "0.2.9-546759",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        