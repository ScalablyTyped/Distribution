organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.3-ba2c9c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4ff4c6",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-d1fb32",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-bb8ceb",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-d7a0f1",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-43428e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-0db244",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        