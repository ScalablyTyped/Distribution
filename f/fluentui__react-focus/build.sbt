organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "7.16.18-12bc36"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-76e421",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-e348a6",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "1.1.1-6a4770",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-test-renderer" % "17.0-dt-20201120Z-d70130",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-292bea",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-800e51",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.19.1-057ea5",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.33.2-f2bc79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
