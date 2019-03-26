organization := "org.scalablytyped"
name := "fkill"
version := "6.0.0-e2d5e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-fa0cc2",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-4a3327",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-8b7933",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20190228Z-5cc3f9",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-7e2353",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pid-from-port" % "1.1-dt-20181209Z-4cb36d",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        