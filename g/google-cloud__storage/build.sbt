organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-838ebd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-1dc7ff",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-fc1fbb",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-d2e178",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.1-6058f4",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-7a0473",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-fad17f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-7c4806")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        