organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.21.1-b16460"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-42c9b9",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-980c9d",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-b03e00",
  "org.scalablytyped" %%% "grammarkdown" % "2.2.0-d38167",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20200515Z-cc7f47",
  "org.scalablytyped" %%% "prex" % "0.4.7-013e65",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
