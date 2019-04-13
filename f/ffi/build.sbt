organization := "org.scalablytyped"
name := "ffi"
version := "0.2-dt-20190212Z-21429a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "ref" % "0.0-unknown-dt-20190322Z-a65b7e",
  "org.scalablytyped" %%% "ref-struct" % "0.0-unknown-dt-20190322Z-2e71da",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        