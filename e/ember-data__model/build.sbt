organization := "org.scalablytyped"
name := "ember-data__model"
version := "3.16-dt-20201028Z-b05358"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ember" % "3.16-dt-20201028Z-b7be0f",
  "org.scalablytyped" %%% "ember-data" % "3.16-dt-20201028Z-8b982a",
  "org.scalablytyped" %%% "ember__application" % "3.16-dt-20201028Z-7ad0cc",
  "org.scalablytyped" %%% "ember__array" % "3.16-dt-20201028Z-1236cb",
  "org.scalablytyped" %%% "ember__component" % "3.16-dt-20201103Z-68fd2a",
  "org.scalablytyped" %%% "ember__controller" % "3.16-dt-20201118Z-5eaa34",
  "org.scalablytyped" %%% "ember__debug" % "3.16-dt-20201028Z-7629d9",
  "org.scalablytyped" %%% "ember__engine" % "3.16-dt-20201028Z-544a34",
  "org.scalablytyped" %%% "ember__error" % "3.16-dt-20201028Z-2893a8",
  "org.scalablytyped" %%% "ember__object" % "3.12-dt-20201028Z-fb8131",
  "org.scalablytyped" %%% "ember__polyfills" % "3.12-dt-20201028Z-2f0117",
  "org.scalablytyped" %%% "ember__routing" % "3.16-dt-20201106Z-8e8a5c",
  "org.scalablytyped" %%% "ember__runloop" % "3.16-dt-20201028Z-c8af70",
  "org.scalablytyped" %%% "ember__service" % "3.16-dt-20201028Z-876378",
  "org.scalablytyped" %%% "ember__template" % "3.16-dt-20201028Z-b88086",
  "org.scalablytyped" %%% "ember__test" % "3.16-dt-20201028Z-1490f2",
  "org.scalablytyped" %%% "ember__utils" % "3.16-dt-20201028Z-b29c8d",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-ec453d",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20201028Z-3fceb3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-ba78fd",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
