organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20190524Z-3e651d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a86019",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-337a2e",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-bfb9ae",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-ce8d0e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-f0de5e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191115Z-a45339",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191014Z-ffa3a7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ac1781",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-d0446a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        