organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-32d050"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "pino" % "5.17-dt-20200309Z-18ac42",
  "org.scalablytyped" %%% "pino-http" % "4.4-dt-20200320Z-703c6d",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-f9b7f6",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-b02784",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
