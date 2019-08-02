organization := "org.scalablytyped"
name := "event-hooks-webpack-plugin"
version := "2.0-dt-20180417Z-26baf3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-8f1343")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        