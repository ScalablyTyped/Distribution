organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.10-385517"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.8-00c385",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.3-b912fd",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.4-46bade",
  "org.scalablytyped" %%% "firebase__util" % "0.2.6-f2490c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        