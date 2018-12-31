organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-36fe52"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-420ff8",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-656266",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-dac0df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181127Z-e08b7c",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181212Z-90fc15",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-859038",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-533c6b",
  "org.scalablytyped" %%% "redux" % "4.0.1-7cb6f2",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        