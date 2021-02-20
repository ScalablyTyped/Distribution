organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "3.1.1-c54c4f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-568555",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20200515Z-79d118",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-7d5f42",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-933252",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-6696aa",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-51eb03",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
