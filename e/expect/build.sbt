organization := "org.scalablytyped"
name := "expect"
version := "24.9.0-15a2b1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-40fe0b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-0b8c96",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-1e02a6",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-095f59",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-421d1d",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-47492f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        