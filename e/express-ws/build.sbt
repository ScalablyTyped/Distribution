organization := "org.scalablytyped"
name := "express-ws"
version := "3.0-dt-20190819Z-32072d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e27953",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-62c2b3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-06675e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-8c6b3a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f18a47",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-7c8f95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        