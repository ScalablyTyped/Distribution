organization := "org.scalablytyped"
name := "emotion"
version := "10.0.9-6a3643"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "create-emotion" % "10.0.9-060c89",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-ac19e6",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-8e67cd",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-0bc9ce",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-41b917",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        