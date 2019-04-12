organization := "org.scalablytyped"
name := "devcert-san"
version := "0.3.3-b9d6d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "command-exists" % "1.2-dt-20181206Z-cabc3c",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-b04ef5",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "eol" % "0.8.1-f8a3c8",
  "org.scalablytyped" %%% "get-port" % "4.2.0-b34d19",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-1134d6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tmp" % "0.1-dt-20190327Z-58e817",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        