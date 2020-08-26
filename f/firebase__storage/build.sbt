organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.3.41-d0ad6e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-a40057",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-5bfbdb",
  "org.scalablytyped" %%% "firebase__component" % "0.1.17-f427e3",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-395863",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.3.13-20762a",
  "org.scalablytyped" %%% "firebase__util" % "0.3.0-58f3ff",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
