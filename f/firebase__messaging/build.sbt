organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.17-4121bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.15-0099de",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.8-74462f",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.9-9fe400",
  "org.scalablytyped" %%% "firebase__util" % "0.2.12-ed260d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        