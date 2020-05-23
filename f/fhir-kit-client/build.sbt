organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20200515Z-0f5e02"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-cf4980",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20200515Z-c5ec09",
  "org.scalablytyped" %%% "form-data" % "3.0.0-81582a",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20200515Z-a3e2dd",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fef1ef",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-ec5ef6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
