organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-24d2d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-aac16e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9371e4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d00fa7",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-c03a8d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c82842",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190522Z-5df1c7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-5e7cae",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190514Z-420149",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-e7fc9c",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-3ec364")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        