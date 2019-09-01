organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.4-1ae3b4"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-78bcce",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f74875",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b43438",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-bb7e3b",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-73dbbc",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        