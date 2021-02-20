organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20201002Z-c3d0cd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-0a8a52",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20201002Z-b374c7",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-8bebe5",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
