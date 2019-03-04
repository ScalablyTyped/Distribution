organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-9ff26d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81d3a1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71585c",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-910f82",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-9e906b",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20190212Z-5f9d92",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-c7db4c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-2595ac",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-ece4ec",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-8d0e0b",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-7136c6",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-adb224",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        