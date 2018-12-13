organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20180910Z-bb7c0f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20180910Z-01b8f9",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-a3f1d8",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20180910Z-f2a8f5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        