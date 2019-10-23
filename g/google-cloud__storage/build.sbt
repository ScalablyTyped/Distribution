organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.5.0-db603f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-429750",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-93c989",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-cef904",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-1da488",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-3a4589")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        