organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-0839ff"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-50032e",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-cbed6e",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-864ad3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c1bc9b",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-8692f4",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-8be734",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20180915Z-539170",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181208Z-69aca3",
  "org.scalablytyped" %%% "redux" % "4.0.1-5c98ab",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        