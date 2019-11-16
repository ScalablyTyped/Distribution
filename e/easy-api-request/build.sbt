organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-a7c26d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a86019",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-c85424",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e2b4ac",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-337a2e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-ce8d0e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-f0de5e",
  "org.scalablytyped" %%% "form-data" % "2.5.1-320383",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-754e42",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-87d96e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ac1781",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-945f8b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        