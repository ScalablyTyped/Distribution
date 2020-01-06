organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-731b06"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "pino" % "5.15-dt-20191223Z-e4d1eb",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-734081",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-db2902",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-802712",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        