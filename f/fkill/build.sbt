organization := "org.scalablytyped"
name := "fkill"
version := "6.0.0-e0a315"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-6457eb",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-b857a2",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20190228Z-294cd2",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-52f01b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "pid-from-port" % "1.1-dt-20181209Z-a93669",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        