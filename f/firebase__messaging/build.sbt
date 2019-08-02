organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.4.7-bf0ae5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.3-4a4b5f",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.3.2-11b357",
  "org.scalablytyped" %%% "firebase__util" % "0.2.22-f84cf6",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        