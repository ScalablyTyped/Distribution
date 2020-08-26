organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "7.12.26-238534"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200708Z-3a4aa5",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200515Z-d35c2a",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-test-renderer" % "16.9-dt-20200515Z-ab3e16",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200521Z-651fdf",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-d9d0a0",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.16.3-8e7204",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.24.6-756819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
