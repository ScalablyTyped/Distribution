organization := "org.scalablytyped"
name := "formatjs__intl"
version := "1.4.8-3be9a4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-7d3dd4",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-6c2779",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-4bd609",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-e9a185",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-79b33b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-d03c86",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
