organization := "org.scalablytyped"
name := "fork-ts-checker-webpack-plugin"
version := "1.6.0-48409e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191126Z-a69022",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191223Z-0f319a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-439809",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-815e4e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-7e3aa1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f0f427",
  "org.scalablytyped" %%% "tslint" % "5.20.1-cc388d",
  "org.scalablytyped" %%% "typescript" % "3.7.4-b5a092",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-4580f3",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-c6dcfb",
  "org.scalablytyped" %%% "worker-rpc" % "0.1.1-11d150")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        