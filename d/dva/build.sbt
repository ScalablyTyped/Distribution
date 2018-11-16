organization := "com.scalablytyped"
name := "dva"
version := "2.4.1-24065b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181102Z-806809",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20181102Z-6e50ec",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20181102Z-161673",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "react-redux" % "6.0.4-dt-20181102Z-30f5b8",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-b5559b",
  "com.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181102Z-d2dc83",
  "com.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181102Z-e5a886",
  "com.scalablytyped" %%% "redux" % "4.0.1-f538df",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        