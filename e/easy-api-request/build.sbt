organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-901bc4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-732eb4",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-475d0e",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-2a9eae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1699d9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-448e20",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-e586f1",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-a93771",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-d940f3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-2ed95f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1e3fd2",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2b35e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        