organization := "org.scalablytyped"
name := "google-cloud__common"
version := "2.0.3-7050a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ad8961",
  "org.scalablytyped" %%% "form-data" % "2.5.0-218ade",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-fee0d8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-c9609e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-86d5a2",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-827831",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-75d383")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        