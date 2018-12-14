organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-22a892"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-1ae338",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-fb4ed9",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-467ac7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-a342b5",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181212Z-920fa0",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-08b351",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181208Z-3ac47e",
  "org.scalablytyped" %%% "redux" % "4.0.1-927e78",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        