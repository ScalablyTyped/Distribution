organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20201002Z-188b87"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-aa2843",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20201002Z-8b2460",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1ba95a",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20201002Z-9df00c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-287250",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-fb70a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
