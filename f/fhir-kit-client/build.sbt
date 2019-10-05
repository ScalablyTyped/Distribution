organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-32a1ca"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e2b4ac",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-2c384a",
  "org.scalablytyped" %%% "form-data" % "2.5.1-8accae",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-956dd9",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-1f94f8",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-78cd71")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        