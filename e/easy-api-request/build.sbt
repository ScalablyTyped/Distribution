organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-6a3b06"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-23cf38",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-bbdab0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-003b73",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e86cd1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-f5dd1c",
  "org.scalablytyped" %%% "form-data" % "2.5.1-d5539e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-e03f45",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-c5c7b2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-454481",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-1961cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        