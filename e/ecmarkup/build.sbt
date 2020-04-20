organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.19.1-74fcf4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-31513f",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-ba2cf5",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20200225Z-d601bd",
  "org.scalablytyped" %%% "prex" % "0.4.6-c8ec4f",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
