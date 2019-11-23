organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.5.0-3598e7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-5962ce",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-fa1b81",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-613396",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-10afe6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-9e16aa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        