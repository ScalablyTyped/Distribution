organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-ecbcee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-063f8d",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-c258c8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-a99e2f",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.1-83a4f1",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-507358",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-71cd48",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-caf6a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        