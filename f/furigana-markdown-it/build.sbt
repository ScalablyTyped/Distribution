organization := "org.scalablytyped"
name := "furigana-markdown-it"
version := "1.0-dt-20201001Z-9ea074"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-bb9dbc",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20201109Z-0d6f0d",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-998ac4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
