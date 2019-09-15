organization := "org.scalablytyped"
name := "express"
version := "4.17-dt-20190819Z-c7b8a5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-54166b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c4eb0c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-a0ab1f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4ec605",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-772576",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-56137c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-86aa8b",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        