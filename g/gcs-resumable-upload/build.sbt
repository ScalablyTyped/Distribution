organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-626ed1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-213330",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-d3e0ee",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-1c8aa6",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-54e5df",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-f1e932",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-7ea0c1",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        