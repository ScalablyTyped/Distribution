organization := "org.scalablytyped"
name := "eslint-plugin-react"
version := "7.20.5-960573"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "7.2-dt-20200611Z-13a6d0",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200623Z-f9f95c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200609Z-573b3d",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
