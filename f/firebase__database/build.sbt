organization := "org.scalablytyped"
name := "firebase__database"
version := "0.6.3-6522d5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-0036be",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-95f6e1",
  "org.scalablytyped" %%% "firebase__component" % "0.1.12-865e07",
  "org.scalablytyped" %%% "firebase__database-types" % "0.5.1-0416fc",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.4-cf862b",
  "org.scalablytyped" %%% "firebase__util" % "0.2.47-004b7a",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
