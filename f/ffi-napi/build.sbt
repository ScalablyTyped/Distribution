organization := "org.scalablytyped"
name := "ffi-napi"
version := "2.4-dt-20190212Z-128a30"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "ref-napi" % "1.4-dt-20190322Z-464935",
  "org.scalablytyped" %%% "ref-struct-di" % "1.1-dt-20190322Z-0ca2e4",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        