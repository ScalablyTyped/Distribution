organization := "org.scalablytyped"
name := "generate-json-webpack-plugin"
version := "0.3-dt-20180601Z-e1b4c7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-7e3aa1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f0f427",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-4580f3",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-c6dcfb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        