organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20190212Z-41ae02"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190225Z-da7f0a",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-2c6446",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-f16652",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-4a070f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        