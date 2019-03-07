organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-3e3e33"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-e317ff",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-421c03",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ecc25b",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-862ffd",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-580844",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190306Z-5b6975",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-228a6b",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-10a0bd",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-39bd0c",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        