organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-e230ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f78539",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6b9a99",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-039467",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-046e36",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-f895cb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7ac2b0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-e11d4d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-26ce9a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d489cc",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-7c4806")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        