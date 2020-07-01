organization := "org.scalablytyped"
name := "favicons-webpack-plugin"
version := "1.0-dt-20191001Z-607e2a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-27e6e5",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200612Z-eee71c",
  "org.scalablytyped" %%% "favicons" % "5.5-dt-20200226Z-305c52",
  "org.scalablytyped" %%% "html-minifier" % "4.0-dt-20200621Z-08ec80",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200515Z-fcd596",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200515Z-737c2a",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200515Z-4452f0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8b5450",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200616Z-5e4f80",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200519Z-be9296",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200625Z-9ee427",
  "org.scalablytyped" %%% "webpack-sources" % "1.4-dt-20200602Z-d8355c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
