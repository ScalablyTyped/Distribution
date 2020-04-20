organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20200226Z-605783"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20200225Z-7daa74",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20200226Z-937805",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20200226Z-1f7412",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-e0911e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-6410c9",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
