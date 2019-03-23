organization := "org.scalablytyped"
name := "external-editor"
version := "3.0.3-30fe85"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chardet" % "0.5-dt-20180426Z-2d2185",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-850d48",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-18a81e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        