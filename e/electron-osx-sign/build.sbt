organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-c69b54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-a95e4d",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-568b5b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-ba2dd2",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-a98a90")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        