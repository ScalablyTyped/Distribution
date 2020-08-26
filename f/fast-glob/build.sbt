organization := "org.scalablytyped"
name := "fast-glob"
version := "3.2.4-217b92"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-225474",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-95b1f7",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-032fc3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
