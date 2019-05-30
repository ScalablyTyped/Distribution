organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-1d03e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-813f47",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-62857b",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-bc4dcd",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-fe4818",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-507358",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-aa8a64",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        