organization := "org.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20180314Z-15e430"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181204Z-72fea2",
  "org.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20180226Z-7352f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-16ceee",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        