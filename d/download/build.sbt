organization := "org.scalablytyped"
name := "download"
version := "6.2-dt-20181231Z-baf9bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-36327a",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190220Z-4ae384",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        