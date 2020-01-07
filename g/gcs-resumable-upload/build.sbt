organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-7a6ab3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4feff3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-12535d",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-48a679",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-73b209",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-e88fa0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-da653c",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        