organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20190322Z-cbabc2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20190322Z-939df9",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-65b8ac",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20190212Z-4dc335")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        