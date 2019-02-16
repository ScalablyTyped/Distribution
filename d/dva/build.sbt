organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-f1deac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-bd3077",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-d5355c",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-292775",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190212Z-8c7663",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190212Z-a1ee9b",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-b56981",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-7a2d75",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-a367e7",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-adaeeb",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        