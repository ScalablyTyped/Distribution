organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20200527Z-397b9f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200515Z-cb78e0",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200623Z-f9f95c",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20200527Z-f40094",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
