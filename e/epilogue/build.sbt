organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-589045"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-dbbefd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b2c6f4",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-7118bd",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-7b0398",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-051e33",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-536bad",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-fd6e75",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f2210d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191126Z-fca8a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        