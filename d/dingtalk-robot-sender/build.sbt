organization := "org.scalablytyped"
name := "dingtalk-robot-sender"
version := "1.1-dt-20190312Z-d43071"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-5e422d",
  "org.scalablytyped" %%% "follow-redirects" % "1.5-dt-20190402Z-6b6b97",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-0fc03e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        