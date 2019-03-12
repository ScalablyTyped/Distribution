organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-8ef09e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0873eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d0697e",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-f9b4ac",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-d62561",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20190212Z-95dc82",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-5aacfd",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cfce5e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-7ba1b2",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ac5a09",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-2be4fc",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-9a4d10",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        