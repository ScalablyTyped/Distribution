organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-891a3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-d8db85",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-315e31",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-f45c3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-35dc6a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-addd8b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        