organization := "org.scalablytyped"
name := "google-cloud__common"
version := "2.1.2-05388f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b57730",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-bb3136",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-9aed3b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-ba6e4d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        