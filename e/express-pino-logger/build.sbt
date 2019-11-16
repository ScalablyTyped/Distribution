organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-973887"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-af1389",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-9c72c7",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-c510ab",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-6b170d",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        