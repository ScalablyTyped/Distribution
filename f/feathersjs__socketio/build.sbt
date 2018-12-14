organization := "org.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20180910Z-be2e79"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181206Z-b9fb7f",
  "org.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20180910Z-0b5a96",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181208Z-0bb175",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        