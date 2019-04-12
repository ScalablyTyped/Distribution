organization := "org.scalablytyped"
name := "fkill"
version := "6.1.0-ce7ce1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-b44f5b",
  "org.scalablytyped" %%% "arrify" % "2.0.1-d2905f",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-272cb8",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20190228Z-f24714",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-22a521",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "pid-from-port" % "1.1-dt-20181209Z-eb7f0a",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        