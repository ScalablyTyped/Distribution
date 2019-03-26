organization := "org.scalablytyped"
name := "gitlab"
version := "4.5.1-b38e3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-bfb77c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7e85a9",
  "org.scalablytyped" %%% "humps" % "v1.1.0-dt-20190322Z-89c1bf",
  "org.scalablytyped" %%% "is-function" % "1.0-dt-20190123Z-737e06",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "parse-link-header" % "1.0-dt-20180214Z-3c5565",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190322Z-09b045",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-b714b2",
  "org.scalablytyped" %%% "request-promise" % "4.1-dt-20180712Z-8be3c3",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5",
  "org.scalablytyped" %%% "url-join" % "4.0-dt-20181231Z-fb45dc",
  "org.scalablytyped" %%% "xhr" % "2.5.0-f4547b",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-565603")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        