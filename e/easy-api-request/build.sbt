organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-825a6f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3bd41f",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-f70e08",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-bf387c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2bbbb8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-0db06c",
  "org.scalablytyped" %%% "form-data" % "2.5.1-a03283",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-ff56fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-9372ca",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a273f8",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        