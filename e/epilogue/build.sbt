organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-9a7a1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c1f3cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-364e03",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-407f14",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4f0018",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-df1ad4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190313Z-57bde5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-c2acbe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-4bd2ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        