organization := "org.scalablytyped"
name := "glue"
version := "5.0-dt-20200515Z-b0aa60"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-c922ee",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-5d07c9",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200515Z-552717",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-7b393d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-89560b",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-36c444",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-9090cb",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-5c9084",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
