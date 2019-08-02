organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-ca93c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-cecd06",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-f149c1",
  "org.scalablytyped" %%% "form-data" % "2.5.0-d126ff",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-892bba",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-1639e3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2c5a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        