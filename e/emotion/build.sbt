organization := "org.scalablytyped"
name := "emotion"
version := "10.0.6-6b5a06"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "create-emotion" % "10.0.6-4b43dd",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.0-6f2455",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.3-d8dd23",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-dd3e6b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-d43e80",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        