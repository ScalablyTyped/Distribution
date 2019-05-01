organization := "org.scalablytyped"
name := "express-enforces-ssl"
version := "1.1-dt-20180214Z-bdabb1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b7a897",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d1a562",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-481648",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-7ae182",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3f05df",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        