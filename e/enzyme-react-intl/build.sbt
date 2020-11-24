organization := "org.scalablytyped"
name := "enzyme-react-intl"
version := "2.0-dt-20201116Z-cb27d4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-76e421",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-e348a6",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-7d3dd4",
  "org.scalablytyped" %%% "formatjs__intl" % "1.4.8-3be9a4",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-6c2779",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-4bd609",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-e9a185",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-79b33b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-d03c86",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-intl" % "5.10.4-2bcb51",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
