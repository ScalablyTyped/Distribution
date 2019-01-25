organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-628f4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-ee6730",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-fd94ae",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-b3a807",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-99d6f9",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-da6b31",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-2e3673",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-ff70f0",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-702c33",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        