organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.3-8012b4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-00c7c1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-bdd51e",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-adb1e8",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-6597fc",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-18bc12",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180910Z-467ac7",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        