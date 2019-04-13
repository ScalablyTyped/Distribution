organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-bf1394"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-58078f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b54bcb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-647453",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-7a04b0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-855427",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4dbd53",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "winston" % "3.2.1-933772",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-6b0995")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        