organization := "org.scalablytyped"
name := "enzyme-to-json"
version := "1.5-dt-20190219Z-4e250f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20190703Z-ba700d",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20190715Z-3ec5ff",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        