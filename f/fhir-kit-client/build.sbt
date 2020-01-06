organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-dca135"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20191014Z-577c48",
  "org.scalablytyped" %%% "form-data" % "2.5.1-d5539e",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-a880c7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-c5c7b2",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-1961cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        