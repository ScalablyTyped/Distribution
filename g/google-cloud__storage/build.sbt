organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.5.0-640b35"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-d403b2",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-b5fd23",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-279b60",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-91bdf6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-2225fa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        