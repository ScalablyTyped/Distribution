organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-3c0b29"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191010Z-4d41b1",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-b53f33",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-f37042",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-4bee8b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        