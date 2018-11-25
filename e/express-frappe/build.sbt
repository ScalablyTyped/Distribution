organization := "com.scalablytyped"
name := "express-frappe"
version := "2.1.3-5b0b16"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-83ee83",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-6d6e76",
  "com.scalablytyped" %%% "cors" % "2.8-dt-20180910Z-f780ee",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-7cbe9d",
  "com.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180910Z-7d2ab7",
  "com.scalablytyped" %%% "express-routers" % "1.0.1-2e13a6",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-87f8bc",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "morgan" % "1.7-dt-20180910Z-6046b1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-7c0e63",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181104Z-0009a6",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-edffa1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        