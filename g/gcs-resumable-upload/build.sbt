organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-0edc37"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4feff3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-a4f35a",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-534dde",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-b143d9",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-0a232b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        