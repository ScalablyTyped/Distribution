organization := "org.scalablytyped"
name := "falcor"
version := "2.0-dt-20190711Z-da5767"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-156031",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-7e29ca",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        