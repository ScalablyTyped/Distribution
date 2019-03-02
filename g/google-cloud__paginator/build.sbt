organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-54a644"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-fb83b6",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-e0af3f",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-4b38fd",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-d257cd",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-68a723",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-6912c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        