organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-06fb5d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-041fae",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0ed5d5",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ad8961",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0256e3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-2f223f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-5ccdcb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-fcbb99",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-af1529",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-6fb98d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-496baf",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-75d383")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        