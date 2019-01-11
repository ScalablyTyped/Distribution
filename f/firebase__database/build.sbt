organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.9-73d006"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.6-aacb5d",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-e14235",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-864ee3",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.3-623b89",
  "org.scalablytyped" %%% "firebase__util" % "0.2.4-0581ca",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        