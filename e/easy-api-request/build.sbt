organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-ded7f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-1927bb",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-041358",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-2a9eae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a3203b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-36041d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-59d609",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-89ebef",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-44e2c6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-5c7da3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-2d4b37",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2b35e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        