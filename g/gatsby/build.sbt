organization := "org.scalablytyped"
name := "gatsby"
version := "2.20.2-20320c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "gatsby-link" % "2.3.0-7853b9",
  "org.scalablytyped" %%% "graphql" % "14.6.0-f78e99",
  "org.scalablytyped" %%% "graphql-compose" % "6.3.8-0a5b91",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-b605ef",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200320Z-481a2b",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
