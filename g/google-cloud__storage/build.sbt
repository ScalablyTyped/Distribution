organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-8eaeb6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-2a9eae",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-179f30",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-2c1895",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-a9bce1",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.0-e25383",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-b01916",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2b35e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        