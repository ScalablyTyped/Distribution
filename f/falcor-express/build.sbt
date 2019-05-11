organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20190322Z-8d0704"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bec058",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-26b345",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3cd88f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-f7bfa3",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-db90b4",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-09c7d4",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-acd145",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ad1ffd",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        