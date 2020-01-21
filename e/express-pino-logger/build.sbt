organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-32308e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "pino" % "5.15-dt-20200115Z-19126a",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-3ab6fd",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-fb7c6e",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-e1fc40",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        