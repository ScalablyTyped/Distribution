organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-5006f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4a385a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-f52607",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-66857b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-613b84",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180214Z-e6f34d",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-27e4a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-1d8801",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-ccb3d5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-146c83",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-2c20e6",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-2d6ab3",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        