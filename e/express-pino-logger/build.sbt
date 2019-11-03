organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-aedb3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-c0f7b2",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-6d8edc",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-21a962",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-1714ed",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        