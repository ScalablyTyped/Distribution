organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20181121Z-715a84"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-4656cd",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-610f83",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-d4abef",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-a3132b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a3aa42",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-a7959e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-a3f1d8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-0007d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-1add06",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        