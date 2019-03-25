organization := "org.scalablytyped"
name := "egg-cookies"
version := "2.2.6-9c7c5b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20190322Z-249d0e",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-359637",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20190322Z-35dcde",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "utility" % "1.16.1-c942af")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        