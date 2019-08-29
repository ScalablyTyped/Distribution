organization := "org.scalablytyped"
name := "express-ejs-layouts"
version := "2.3-dt-20190819Z-626bf0"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-105136",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-517334",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-676404",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-f1a335",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-2a850b",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        