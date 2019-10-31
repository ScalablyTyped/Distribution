organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-368707"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-cf343a",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-916734",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-7333f7",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-d37b67",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-1da488",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-751ae9",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        