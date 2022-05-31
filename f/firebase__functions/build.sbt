organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.6.1-e4b095"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-680562",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-8b0729",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-e877b4",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.4.0-99e841",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-fc6b40",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.5.0-af7587",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-06d2d6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
