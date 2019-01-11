organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-97a51a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-06a130",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-5edd6b",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-276dc8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-552d91",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181229Z-b192cb",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-7dc784",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-908624",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-e31efa",
  "org.scalablytyped" %%% "redux" % "4.0.1-44220d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        