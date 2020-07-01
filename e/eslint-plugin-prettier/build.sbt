organization := "org.scalablytyped"
name := "eslint-plugin-prettier"
version := "3.1-dt-20200515Z-6fd256"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "7.2-dt-20200611Z-0bdabe",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200623Z-7e9f3c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200609Z-eb84ae",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
