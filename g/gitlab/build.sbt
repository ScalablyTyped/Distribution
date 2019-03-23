organization := "org.scalablytyped"
name := "gitlab"
version := "4.5.1-6ff350"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-34b699",
  "org.scalablytyped" %%% "humps" % "v1.1.0-dt-20190322Z-43eab1",
  "org.scalablytyped" %%% "is-function" % "1.0-dt-20190123Z-fb22c1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "parse-link-header" % "1.0-dt-20180214Z-037b52",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190322Z-4cb5e9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c78680",
  "org.scalablytyped" %%% "request-promise" % "4.1-dt-20180712Z-9bd88a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "url-join" % "4.0-dt-20181231Z-c93307",
  "org.scalablytyped" %%% "xhr" % "2.5.0-5549d7",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        