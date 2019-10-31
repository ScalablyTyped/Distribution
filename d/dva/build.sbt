organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-f97450"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191014Z-f90d50",
  "org.scalablytyped" %%% "react-router-dom" % "5.1-dt-20191030Z-209d0f",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190822Z-11db8b",
  "org.scalablytyped" %%% "redux" % "4.0.4-783f8a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        