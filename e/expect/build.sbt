organization := "org.scalablytyped"
name := "expect"
version := "24.9.0-10ae08"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-40fe0b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-0b8c96",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-1e02a6",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-77a898",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-ba019c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-1ea3a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        