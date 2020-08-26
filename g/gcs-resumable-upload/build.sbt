organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "3.1.1-920a32"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-58a566",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20200515Z-193d3f",
  "org.scalablytyped" %%% "gaxios" % "3.1.0-8e0280",
  "org.scalablytyped" %%% "google-auth-library" % "6.0.6-a83bed",
  "org.scalablytyped" %%% "gtoken" % "5.0.3-6543a6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-262a2f",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
