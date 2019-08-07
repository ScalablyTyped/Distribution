organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-b8cc43"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e3bdb7",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-3b0c07",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-cecd06",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-515b96",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-364f17",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-78fca5",
  "org.scalablytyped" %%% "form-data" % "2.5.0-218d3e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-d5ea6f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-488a00",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3dc604",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2c5a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        