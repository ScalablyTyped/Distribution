organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.1-4127fb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-227146",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.3.2-7666b5",
  "org.scalablytyped" %%% "ethereumjs-util" % "6.2.0-7bcdbf",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "rlp" % "2.2.3-de1f63",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        