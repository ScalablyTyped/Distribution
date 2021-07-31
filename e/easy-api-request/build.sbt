organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20201002Z-1daf0c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-af8262",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-121a7f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-f54a76",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fd1f78",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-ae5005")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
