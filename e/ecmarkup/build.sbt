organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.25.3-b03946"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-3510e3",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-ede2cf",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-2002c2",
  "org.scalablytyped" %%% "grammarkdown" % "2.2.0-b43440",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20200515Z-be2741",
  "org.scalablytyped" %%% "prex" % "0.4.7-e8cd98",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
