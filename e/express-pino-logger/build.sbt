organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-16822f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191007Z-c1e016",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-961d04",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-258f22",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-cddc36",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        