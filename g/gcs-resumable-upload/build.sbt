organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.0-147d4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4ff4c6",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-ef1846",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-b3bbb6",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-d35082",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-43428e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-c6cb5b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        