organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-64186e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-62e16d",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-5e09bb",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-61821a",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-83c270",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-6769ec",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-0c6dd1",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        