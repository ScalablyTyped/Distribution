organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-202bce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-813f47",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-b6697a",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-2df373",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-f1d4dc",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-c47b41",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-bbc3a0",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        