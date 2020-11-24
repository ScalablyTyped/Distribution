organization := "org.scalablytyped"
name := "ember"
version := "3.16-dt-20201028Z-cc898c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.16-dt-20201028Z-d3c1f8",
  "org.scalablytyped" %%% "ember__array" % "3.16-dt-20201028Z-7674b4",
  "org.scalablytyped" %%% "ember__component" % "3.16-dt-20201103Z-19b4ca",
  "org.scalablytyped" %%% "ember__controller" % "3.16-dt-20201118Z-bc917f",
  "org.scalablytyped" %%% "ember__debug" % "3.16-dt-20201028Z-92eb9c",
  "org.scalablytyped" %%% "ember__engine" % "3.16-dt-20201028Z-50aeb1",
  "org.scalablytyped" %%% "ember__error" % "3.16-dt-20201028Z-8a3126",
  "org.scalablytyped" %%% "ember__object" % "3.12-dt-20201028Z-efb0b4",
  "org.scalablytyped" %%% "ember__polyfills" % "3.12-dt-20201028Z-016a26",
  "org.scalablytyped" %%% "ember__routing" % "3.16-dt-20201106Z-19e821",
  "org.scalablytyped" %%% "ember__runloop" % "3.16-dt-20201028Z-b075fc",
  "org.scalablytyped" %%% "ember__service" % "3.16-dt-20201028Z-ec89cc",
  "org.scalablytyped" %%% "ember__template" % "3.16-dt-20201028Z-1d9fea",
  "org.scalablytyped" %%% "ember__test" % "3.16-dt-20201028Z-2e772f",
  "org.scalablytyped" %%% "ember__utils" % "3.16-dt-20201028Z-0d7617",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20201028Z-95d403",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
