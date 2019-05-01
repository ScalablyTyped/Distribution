organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.3.19-78d501"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.10-f71b36",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.11-c25167",
  "org.scalablytyped" %%% "firebase__util" % "0.2.14-956cb0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        