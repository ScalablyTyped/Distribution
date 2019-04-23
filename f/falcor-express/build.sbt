organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20190322Z-b815e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f1929d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e08638",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-b33a41",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-738086",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-366d1d",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-0fee3d",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-6e11bd",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a29b80",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        