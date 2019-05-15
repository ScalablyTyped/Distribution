organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-e97074"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-62e16d",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-3a78a3",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-0e4cbc",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-7fbe0c",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-34a907",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        