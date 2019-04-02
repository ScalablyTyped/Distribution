organization := "org.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20190213Z-0a83a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181204Z-ff19b7",
  "org.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20190213Z-ae9cab",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20190322Z-1e1907",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        