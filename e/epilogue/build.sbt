organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-70d090"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ab0cf8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c1e1a0",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-1ea83a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3db512",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190227Z-36320d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-3a092c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        