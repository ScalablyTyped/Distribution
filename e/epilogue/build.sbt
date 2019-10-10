organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-71803e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0961f2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-8cdc06",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-bce92f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190927Z-e702c1",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-4e8943")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        