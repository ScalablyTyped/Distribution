organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.5-79e1d5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-78bcce",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f79d50",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-58bd30",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-463bc3",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-7444f3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-dc56bc",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        