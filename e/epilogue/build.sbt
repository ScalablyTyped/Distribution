organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20220819Z-38620f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-4dfd19",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-3598f3",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-d0c1ad",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221022Z-c6669d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
