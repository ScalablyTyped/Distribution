organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.3-e994f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4ff4c6",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-341c95",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-4baa9f",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-ee67ed",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-43428e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-25ec61",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        