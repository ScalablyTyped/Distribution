organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20190711Z-333bf7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20190711Z-bdd0a1",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-3555ef",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-5c850c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b91d25",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-d3a16e",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        