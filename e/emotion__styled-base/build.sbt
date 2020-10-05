organization := "org.scalablytyped"
name := "emotion__styled-base"
version := "10.0.31-8eeb59"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b0fb5c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-a423d1",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-228a3a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-f69275",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-695c73",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
