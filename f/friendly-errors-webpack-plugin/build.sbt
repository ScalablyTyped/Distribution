organization := "org.scalablytyped"
name := "friendly-errors-webpack-plugin"
version := "0.1-dt-20180214Z-a16d4d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-92d399",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-3bfc94",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-faabb7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-dbe32d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        