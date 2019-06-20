organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-34c0e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-1ea477",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f78539",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-039467",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-9d7622",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-046e36",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-f895cb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-454408",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-5aec84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d489cc",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-b83a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        