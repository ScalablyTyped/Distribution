organization := "org.scalablytyped"
name := "globule"
version := "1.1-dt-20180214Z-083011"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3ecb5b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        