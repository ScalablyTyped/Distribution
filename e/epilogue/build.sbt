organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-1265d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b7a897",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d1a562",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-00df9f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-481648",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-7ae182",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-407536",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190412Z-8a08b6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3f05df",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-1b1624")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        