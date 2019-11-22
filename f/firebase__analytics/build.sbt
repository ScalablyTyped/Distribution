organization := "org.scalablytyped"
name := "firebase__analytics"
version := "0.2.7-0886ed"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.2.3-d3dc76",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.7-c4a47c",
  "org.scalablytyped" %%% "firebase__util" % "0.2.33-12794d",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        