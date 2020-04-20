organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.3-713d8c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-aa5013",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-8181af",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-1032d8",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-0c4590",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-302f8c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-a8da31",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
