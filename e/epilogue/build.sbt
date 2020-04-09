organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20200227Z-c1073a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-2fc7af",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20200225Z-32db12",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200331Z-8af6d1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20200225Z-a394fd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "validator" % "13.0-dt-20200407Z-bae728")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
