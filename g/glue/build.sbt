organization := "org.scalablytyped"
name := "glue"
version := "5.0-dt-20181104Z-059ba0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-f1f267",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-8d834a",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-0ec501",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-3e7898",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-9abdd3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-fca61e",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-2ab15c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-e52d61",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-752ee2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        