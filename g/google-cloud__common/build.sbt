organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.32.1-c556b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-440f74",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-f864e8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-c1e353",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-507358",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-35aa0b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-caf6a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        