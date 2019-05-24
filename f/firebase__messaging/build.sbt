organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.21-696986"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-df120c",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.11-aad881",
  "org.scalablytyped" %%% "firebase__util" % "0.2.16-30db1b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        