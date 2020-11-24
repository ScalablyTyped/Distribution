organization := "org.scalablytyped"
name := "ecmarkup"
version := "4.2.1-98dd2f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-7264d5",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-f83a01",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-53be18",
  "org.scalablytyped" %%% "grammarkdown" % "2.2.7-17ea04",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20201002Z-e558fb",
  "org.scalablytyped" %%% "prex" % "0.4.7-a42f82",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
