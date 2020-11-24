organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "5.5.0-446036"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-63b11d",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-e2e694",
  "org.scalablytyped" %%% "google-cloud__common" % "3.5.0-7a1d78",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-218662",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "teeny-request" % "7.0.1-66f3e5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
