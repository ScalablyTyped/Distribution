organization := "com.scalablytyped"
name := "dva"
version := "2.4.1-253202"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-07fae9",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-118bf2",
  "com.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-890fdf",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-40dc87",
  "com.scalablytyped" %%% "react-redux" % "6.0-dt-20181121Z-6ef6ae",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-752ace",
  "com.scalablytyped" %%% "react-router-dom" % "4.3-dt-20180915Z-cfc662",
  "com.scalablytyped" %%% "react-router-redux" % "5.0-dt-20180915Z-9e2da8",
  "com.scalablytyped" %%% "redux" % "4.0.1-9e09bf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        