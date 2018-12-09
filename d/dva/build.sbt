organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-f9fd6f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-3c1144",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-2f0248",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-70f06b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-bf27c3",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-45f508",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20180915Z-7a6eb5",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181208Z-a7aab2",
  "org.scalablytyped" %%% "redux" % "4.0.1-580107",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        