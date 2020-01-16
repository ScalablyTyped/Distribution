organization := "org.scalablytyped"
name := "favicons-webpack-plugin"
version := "1.0-dt-20191001Z-d8f8b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-340e6e",
  "org.scalablytyped" %%% "favicons" % "5.5-dt-20191220Z-da2d4d",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-6a53ae",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-0be342",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-84d89d",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-beaace",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-18f558",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-c88c35",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-d3d687")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        