organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.7-450ccc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-8fd839",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-16fd78",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-259782",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-c4393c",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-e3b965",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        