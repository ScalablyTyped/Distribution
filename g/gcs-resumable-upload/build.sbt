organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-b5e8e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-62e16d",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-93db45",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-54faae",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-c5dbd9",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-d5d4c6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        