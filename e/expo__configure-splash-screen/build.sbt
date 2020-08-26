organization := "org.scalablytyped"
name := "expo__configure-splash-screen"
version := "0.1.13-e6979f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color-string" % "1.5-dt-20200515Z-0ff1ed",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "xml-js" % "1.6.11-bb6a60")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
