organization := "com.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20180910Z-a9c480"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20180910Z-ab32f7",
  "com.scalablytyped" %%% "q" % "1.5-dt-20180915Z-726082",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "thrift" % "0.10-dt-20180910Z-ed3166",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        