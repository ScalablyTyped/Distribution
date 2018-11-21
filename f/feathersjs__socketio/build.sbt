organization := "com.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20180910Z-733dba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "feathersjs__feathers" % "3.0-dt-20180915Z-5a7450",
  "com.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20180910Z-6e0efd",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181104Z-f9faf5",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        