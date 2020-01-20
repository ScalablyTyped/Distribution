organization := "org.scalablytyped"
name := "react-redux-facade"
version := "202001181026-c8de5e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1161bc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ff2431",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ecff2c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-b04669",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200115Z-8261b2",
  "org.scalablytyped" %%% "redux" % "4.0.5-f1e7e3",
  "org.scalablytyped" %%% "std" % "3.7-447fe9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        