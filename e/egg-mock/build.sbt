organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20200515Z-22f874"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-7f6a30",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-9875f5",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20200515Z-707ad1",
  "org.scalablytyped" %%% "egg" % "2.27.0-ca26f8",
  "org.scalablytyped" %%% "egg-cookies" % "2.4.2-8ca3e9",
  "org.scalablytyped" %%% "egg-core" % "4.17.4-4cf328",
  "org.scalablytyped" %%% "egg-logger" % "2.4.2-8f1f99",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-723b36",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-a09b4e",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20200515Z-ee35d5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "urllib" % "2.36.1-7f2bcd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
