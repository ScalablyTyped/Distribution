organization := "org.scalablytyped"
name := "expect"
version := "26.2.0-52fb08"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "4.1.0-f17808",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-73ff2c",
  "org.scalablytyped" %%% "jest-diff" % "26.2.0-577337",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.2.0-2bf616",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dd389b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
