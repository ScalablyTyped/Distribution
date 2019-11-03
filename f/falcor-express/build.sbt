organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20190711Z-a20d69"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e7066f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-76449c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-35383f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-ab49c4",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20190711Z-0ca35f",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-5a94e7",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-8663d3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6b473e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        