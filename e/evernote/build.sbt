organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20180910Z-a79a77"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20180910Z-12d416",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-ba2c26",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20180910Z-db3dc1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        