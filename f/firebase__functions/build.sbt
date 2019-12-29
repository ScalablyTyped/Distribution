organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.4.28-46548f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-df39d1",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.1-39688d",
  "org.scalablytyped" %%% "firebase__component" % "0.1.1-db08bb",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.13-1de116",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.4.0-f305f7",
  "org.scalablytyped" %%% "firebase__util" % "0.2.36-d78b6e",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        