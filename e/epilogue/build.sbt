organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-3b355f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-756d43",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-7c4262",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-0f07d6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-8f4d08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-af1292",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d115b2",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-dd79ab",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-91019c",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-46403f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        