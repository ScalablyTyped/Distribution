organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-3ccb19"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-09ae4a",
  "org.scalablytyped" %%% "form-data" % "2.5.0-f596c2",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-1140f2",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-4bb302",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-584a59")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        