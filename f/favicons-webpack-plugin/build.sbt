organization := "org.scalablytyped"
name := "favicons-webpack-plugin"
version := "1.0-dt-20191001Z-1ea347"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-6f65c7",
  "org.scalablytyped" %%% "favicons" % "5.3-dt-20190212Z-4b711e",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-ac692c",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-557572",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-83f9dd",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c659dd",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-d0fa98",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-7974be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        