organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-d75eb9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-ff323c",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-87bc24",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-8cd97b",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-e1a26b",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-86d5a2",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-81f595",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        