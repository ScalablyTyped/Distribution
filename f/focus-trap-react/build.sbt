organization := "org.scalablytyped"
name := "focus-trap-react"
version := "6.0.0-19a2b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "focus-trap" % "4.0.2-6712a9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-768022",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tabbable" % "3.1-dt-20180921Z-2f9c55",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-750ba0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        