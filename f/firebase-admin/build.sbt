organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.3.0-01aee5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-cecd06",
  "org.scalablytyped" %%% "form-data" % "2.5.0-d126ff",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-4c527c",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-5a3714",
  "org.scalablytyped" %%% "google-cloud__common" % "2.0.5-78c6c6",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.4-bff8de",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.0.4-467505",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-43428e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-1639e3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2c5a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        