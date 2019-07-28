organization := "org.scalablytyped"
name := "google-cloud__common"
version := "2.0.4-1689b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-cecd06",
  "org.scalablytyped" %%% "form-data" % "2.5.0-642513",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-b3bbb6",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-d35082",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-43428e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-15e7b6",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2c5a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        