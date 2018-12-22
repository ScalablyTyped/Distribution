organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-1d0786"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-ba6936",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ed559c",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-3fbe3d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181127Z-79072d",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181212Z-56d565",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-4c88e9",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-25d01c",
  "org.scalablytyped" %%% "redux" % "4.0.1-2c8d01",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        