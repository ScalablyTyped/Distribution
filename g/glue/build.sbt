organization := "org.scalablytyped"
name := "glue"
version := "5.0-dt-20181023Z-662128"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-7b86c5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-47ec69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7a013f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        