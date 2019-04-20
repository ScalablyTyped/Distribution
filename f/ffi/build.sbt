organization := "org.scalablytyped"
name := "ffi"
version := "0.2-dt-20190212Z-3f5824"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "ref" % "0.0-unknown-dt-20190322Z-dc918f",
  "org.scalablytyped" %%% "ref-struct" % "0.0-unknown-dt-20190322Z-17a751",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        