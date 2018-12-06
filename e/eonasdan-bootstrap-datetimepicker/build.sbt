organization := "com.scalablytyped"
name := "eonasdan-bootstrap-datetimepicker"
version := "v4.17.37-dt-20180910Z-1fcf85"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-02d7ed",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        