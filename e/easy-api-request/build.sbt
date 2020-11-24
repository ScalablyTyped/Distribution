organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20201002Z-d5ac1f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-a0518a",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-911575",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8c69ed",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-106b03",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-989d2d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-f8d115")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
