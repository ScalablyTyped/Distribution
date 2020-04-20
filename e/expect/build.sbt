organization := "org.scalablytyped"
name := "expect"
version := "25.3.0-feeb15"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "3.0.0-a95f79",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-7617e4",
  "org.scalablytyped" %%% "jest-diff" % "25.3.0-8f8e6f",
  "org.scalablytyped" %%% "jest-matcher-utils" % "25.3.0-89e6ba",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-fcf18c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
