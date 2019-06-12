organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-fceb8b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-cca586",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-ce3a13",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-ca1840",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-f1d1f2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-3be793")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        