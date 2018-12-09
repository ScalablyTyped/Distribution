organization := "org.scalablytyped"
name := "emotion-theming"
version := "10.0.4-0d5384"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-dc38e6",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-5dc68a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        