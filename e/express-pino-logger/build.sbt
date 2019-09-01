organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20190826Z-d113ad"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3bd41f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-bf387c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2bbbb8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-0db06c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190830Z-69ef7a",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-6f1dbd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a273f8",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-56c55d",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        