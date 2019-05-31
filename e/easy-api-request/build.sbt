organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-c6b1ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8931e7",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-34b49e",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-85ff12",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ba6df1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-1f48f2",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-440f74",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-4c7a25",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-35aa0b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-20ad05",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-caf6a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        