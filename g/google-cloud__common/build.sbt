organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.32.1-7d8ed3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-315e31",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-2df373",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-f1d4dc",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-c47b41",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-35dc6a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-addd8b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        