organization := "com.scalablytyped"
name := "encoding-down"
version := "5.0-dt-20180918Z-2da323"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180915Z-187c0c",
  "com.scalablytyped" %%% "level-codec" % "9.0-dt-20180910Z-dc76bd",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        