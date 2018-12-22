organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.3-7c4b24"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-35017a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-a29f03",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-928709",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-45d355",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-fe24e7",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-3fbe3d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        