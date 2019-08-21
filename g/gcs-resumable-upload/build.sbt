organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.3-08aeaf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-78bcce",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-9e74d5",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-273123",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-299c84",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-c46eab",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-651094",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        