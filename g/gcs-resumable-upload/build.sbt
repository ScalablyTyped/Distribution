organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-d8606c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-813f47",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-4fa0b3",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-ce94e0",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-5fab14",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-7a0473",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-36be6b",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        