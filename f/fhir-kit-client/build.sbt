organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-914aed"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-b61a2d",
  "org.scalablytyped" %%% "form-data" % "2.5.1-2d2a80",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-4cfce5",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-48fc9d",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        