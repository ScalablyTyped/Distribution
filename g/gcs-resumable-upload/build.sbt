organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-5c8c33"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4feff3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-ee328c",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-0c2e00",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-5c2628",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-c15009",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        