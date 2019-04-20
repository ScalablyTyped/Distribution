organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-9c3bfe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8a324d",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-c9c819",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-85eb02",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.0-9a9f9e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-edaf46",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-70f635",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        