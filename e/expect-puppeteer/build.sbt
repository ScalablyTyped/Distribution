organization := "org.scalablytyped"
name := "expect-puppeteer"
version := "3.3-dt-20181205Z-b03954"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190307Z-d00d7b",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-4b7335",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "puppeteer" % "1.12-dt-20190302Z-496873",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        