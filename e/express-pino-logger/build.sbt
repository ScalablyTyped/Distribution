organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-95b78e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191010Z-0f54e7",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-f9eb66",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-f18d3e",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-c57a9c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        