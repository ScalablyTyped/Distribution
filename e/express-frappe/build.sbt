organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-f3b90d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-e6f42b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180214Z-d1e4f5",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-749c32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-77d336",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-2a6537",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a3e4d1",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        