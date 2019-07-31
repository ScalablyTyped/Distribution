organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-824d09"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c9d11e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81b6cc",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-65363d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-455870",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-b394d9",
  "org.scalablytyped" %%% "egg" % "2.23.0-860d4c",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-4653cd",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-727eee",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-694f80",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-1c5c3a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-8a448f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-d99a71",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-1edcf0",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190627Z-f5c2fa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-f9da0b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "urllib" % "2.34.0-87d6fb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        