organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-d097b3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4feff3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-849289",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-168bb5",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-173d29",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-e88fa0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-ee6710",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        