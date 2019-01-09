organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-45928f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-29118d",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-8159b9",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-27deba",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181229Z-65175e",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-bdf223",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-f1b191",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-b29103",
  "org.scalablytyped" %%% "redux" % "4.0.1-f0c24b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        