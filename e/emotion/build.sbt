organization := "org.scalablytyped"
name := "emotion"
version := "10.0.9-fd448d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "create-emotion" % "10.0.9-fa1286",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-2203ad",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-2ffa70",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-a7f9c3",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-255ee0",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        