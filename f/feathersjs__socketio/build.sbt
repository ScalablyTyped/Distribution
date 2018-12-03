organization := "com.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20180910Z-d81a9e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181121Z-a5965f",
  "com.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20180910Z-0acc64",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181104Z-841022",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        