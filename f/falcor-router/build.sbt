organization := "org.scalablytyped"
name := "falcor-router"
version := "0.4.0-dt-20190322Z-42cc39"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-b97b58",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-000be1",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-e169dc",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        