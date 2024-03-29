organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20201028Z-fe6f57"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-0d457c",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-434816",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-d899e7",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20201002Z-d3c903",
  "org.scalablytyped" %%% "egg" % "2.29.1-7c5ae4",
  "org.scalablytyped" %%% "egg-cookies" % "2.4.2-5c64cc",
  "org.scalablytyped" %%% "egg-core" % "4.20.0-183f09",
  "org.scalablytyped" %%% "egg-logger" % "2.4.2-1efcdf",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-5835a3",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-b7b66f",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20201002Z-a6ce14",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "urllib" % "2.36.1-af3206")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
