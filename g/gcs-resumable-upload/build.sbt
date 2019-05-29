organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-7a845c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-813f47",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-bc4ca9",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-755832",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-6e2de1",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-d8ff65",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-45b8e5",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        