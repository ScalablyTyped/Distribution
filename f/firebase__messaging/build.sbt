organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.6.4-bc7e1d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.1-dd0356",
  "org.scalablytyped" %%% "firebase__component" % "0.1.5-56df44",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.1-875251",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.4.2-afab9b",
  "org.scalablytyped" %%% "firebase__util" % "0.2.40-cf6ddf",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-c2571b",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
