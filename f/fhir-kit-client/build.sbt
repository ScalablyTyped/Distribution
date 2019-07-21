organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-ab372f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ad8961",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-a91285",
  "org.scalablytyped" %%% "form-data" % "2.5.0-89d0a6",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-5e50d4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-be1a0c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-75d383")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        