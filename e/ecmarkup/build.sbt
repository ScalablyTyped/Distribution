organization := "org.scalablytyped"
name := "ecmarkup"
version := "4.2.1-bf09d0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-e47794",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-3be67e",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-dd1a4e",
  "org.scalablytyped" %%% "grammarkdown" % "2.2.7-15b9f1",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20201002Z-d71374",
  "org.scalablytyped" %%% "prex" % "0.4.7-5a5e3a",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
