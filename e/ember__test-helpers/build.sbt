organization := "org.scalablytyped"
name := "ember__test-helpers"
version := "1.7-dt-20201028Z-0c5de5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.16-dt-20201028Z-d3c1f8",
  "org.scalablytyped" %%% "ember__component" % "3.16-dt-20201103Z-19b4ca",
  "org.scalablytyped" %%% "ember__controller" % "3.16-dt-20201118Z-bc917f",
  "org.scalablytyped" %%% "ember__engine" % "3.16-dt-20201028Z-50aeb1",
  "org.scalablytyped" %%% "ember__error" % "3.16-dt-20201028Z-8a3126",
  "org.scalablytyped" %%% "ember__object" % "3.12-dt-20201028Z-efb0b4",
  "org.scalablytyped" %%% "ember__routing" % "3.16-dt-20201106Z-19e821",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20201028Z-95d403",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
