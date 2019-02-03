organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-434d0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4e5340",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de8dcd",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-e02aaf",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ea3f90",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180214Z-237a54",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-e4d416",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd7dc7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-b49bd5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-cb5d09",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-45b4b5",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-c6e9be",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        