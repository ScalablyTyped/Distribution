organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-681dad"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "pino" % "5.14-dt-20191206Z-a796b8",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-bfec93",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-852198",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-936227",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        