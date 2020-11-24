organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-ebd772"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-cef456",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20201002Z-70701c",
  "org.scalablytyped" %%% "react-router-dom" % "5.1-dt-20201006Z-83ec0f",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20200515Z-4b7c33",
  "org.scalablytyped" %%% "redux" % "4.0.5-1401a8",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
