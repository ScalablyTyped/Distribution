organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.6.0-29ec2b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.7-1748d6",
  "org.scalablytyped" %%% "firebase__component" % "0.1.1-d8a151",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.2.4-66c4c4",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.4.0-20890f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.33-34219b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        