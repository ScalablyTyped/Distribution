organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "5.1.2-ed0556"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "3.1.0-8e0280",
  "org.scalablytyped" %%% "google-auth-library" % "6.0.6-a83bed",
  "org.scalablytyped" %%% "google-cloud__common" % "3.3.2-0ccd4b",
  "org.scalablytyped" %%% "gtoken" % "5.0.3-6543a6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "teeny-request" % "7.0.0-7c2a4f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
