organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-fb7907"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-813f47",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-e3bbce",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-f864e8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-c1e353",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-507358",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-04e4f5",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        