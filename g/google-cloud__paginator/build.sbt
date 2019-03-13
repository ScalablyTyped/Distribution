organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-a54fd3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-74de59",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-31fee9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-fbcdf7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e36449")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        