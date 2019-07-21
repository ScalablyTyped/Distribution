organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.2.0-2cb008"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ad8961",
  "org.scalablytyped" %%% "form-data" % "2.5.0-89d0a6",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-8d9c87",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-792421",
  "org.scalablytyped" %%% "google-cloud__common" % "2.0.4-d0cfde",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.4-08e674",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.0.3-99a169",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-86d5a2",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-be1a0c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-75d383")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        