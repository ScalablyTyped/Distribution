organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-6d4c00"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-61c40c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-70f930",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-662401",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-2550bc",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-15e686",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190318Z-e200e2",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-d9986b",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-9de153",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-f87aee",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        