organization := "org.scalablytyped"
name := "ember__debug"
version := "3.16-dt-20201028Z-7629d9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ember__engine" % "3.16-dt-20201028Z-544a34",
  "org.scalablytyped" %%% "ember__object" % "3.12-dt-20201028Z-fb8131",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20201028Z-3fceb3",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
