organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-dcea62"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f180da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d03b6a",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-1cf584",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-d92710",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4d11bc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-847d1b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-12c9b7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-45e6c4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4ff83c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191126Z-44026b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        