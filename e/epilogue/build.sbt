organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-be5b33"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-ea079a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-0ab2aa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-2df7b1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-488272",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-a1c393",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-c44053",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ba7911",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-4e1d6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        