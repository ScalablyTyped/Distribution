organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.3.1-df92c3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-1c53ac",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-43a29b",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-9e1e3b",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-d488ce",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-f6ddd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        