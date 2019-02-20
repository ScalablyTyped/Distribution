organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-e0fb1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-a9baf4",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-2af66c",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-92dd44",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-04c520",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-f6f312")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        