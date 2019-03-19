organization := "org.scalablytyped"
name := "egg-cookies"
version := "2.2.6-e2de2d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20180214Z-249d0e",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-77cebe",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20181121Z-a0a44f",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "utility" % "1.15.1-7ca06e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        