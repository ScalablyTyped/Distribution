organization := "org.scalablytyped"
name := "gitlab"
version := "4.5.1-f25ed7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-3bb744",
  "org.scalablytyped" %%% "humps" % "v1.1.0-dt-20190322Z-d9c0e2",
  "org.scalablytyped" %%% "is-function" % "1.0-dt-20190123Z-6c65c2",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "parse-link-header" % "1.0-dt-20180214Z-01ad06",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190322Z-2e1340",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-da2822",
  "org.scalablytyped" %%% "request-promise" % "4.1-dt-20180712Z-0ee6e3",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "url-join" % "4.0-dt-20181231Z-d2aad9",
  "org.scalablytyped" %%% "xhr" % "2.5.0-ab9d90",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-8e3fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        