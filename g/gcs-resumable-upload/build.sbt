organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.2-dd901b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-aa5013",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f86b9a",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-36e034",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-f48e8e",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-7ee270",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-bb2e70",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
