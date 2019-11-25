organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.1-b777d6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-7bd93a",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.3.2-c59b57",
  "org.scalablytyped" %%% "ethereumjs-util" % "6.2.0-3d3714",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "rlp" % "2.2.3-96eb9d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        