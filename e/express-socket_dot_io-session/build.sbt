organization := "com.scalablytyped"
name := "express-socket_dot_io-session"
version := "1.3-dt-20181102Z-3cba77"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20181102Z-5991c4",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20181102Z-210269",
  "com.scalablytyped" %%% "express" % "4.16-dt-20181102Z-d3111c",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20181102Z-8da2fa",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20181102Z-399813",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20181102Z-c1072c",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181102Z-dbdbb6",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        