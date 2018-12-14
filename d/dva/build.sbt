organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-080abd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-7053ae",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-8c7bdd",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-fcf52e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0f3c05",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-54ca8c",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181212Z-718fff",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-e587f7",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181208Z-e59124",
  "org.scalablytyped" %%% "redux" % "4.0.1-7c9b0b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        