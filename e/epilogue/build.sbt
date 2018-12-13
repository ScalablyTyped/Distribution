organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180910Z-bc269f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-4656cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-d4abef",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-98b3ff",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-a3132b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a3aa42",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181211Z-47f37a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-1add06",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "validator" % "v9.4-dt-20181213Z-c8893f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        