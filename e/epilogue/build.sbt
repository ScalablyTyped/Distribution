organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-a04610"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0c9c39",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-d4399c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190816Z-515e7b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190816Z-71409c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190816Z-cbbb3c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190722Z-e91604",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-55674a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190723Z-79b36f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        