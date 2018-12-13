organization := "org.scalablytyped"
name := "frisby"
version := "2.0-dt-20181109Z-90582b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181204Z-fc8566",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-cc59b1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-4dc81b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        