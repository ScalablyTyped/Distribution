organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20201002Z-41e850"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-ee840c",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20201002Z-8d0803",
  "org.scalablytyped" %%% "form-data" % "3.0.0-438be1",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20201002Z-7fab40",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-6ac064",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-821692")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
