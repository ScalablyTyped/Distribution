organization := "org.scalablytyped"
name := "gatsby-cli"
version := "2.14.0-fa34b2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chalk" % "4.1.0-ea614b",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20200226Z-be1e9b",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20201002Z-54640d",
  "org.scalablytyped" %%% "opentracing" % "0.14.5-be5e14",
  "org.scalablytyped" %%% "pretty-error" % "2.1.2-e3e0ff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "redux" % "4.0.5-09f522",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20201002Z-590f8a",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
