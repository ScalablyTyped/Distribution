organization := "org.scalablytyped"
name := "ffi-napi"
version := "2.4-dt-20190212Z-463d58"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "ref-napi" % "1.4-dt-20190322Z-68d577",
  "org.scalablytyped" %%% "ref-struct-di" % "1.1-dt-20190322Z-fd1956",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        