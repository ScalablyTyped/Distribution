organization := "org.scalablytyped"
name := "firebase__storage-types"
version := "0.3.13-bc365b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-8c5a99",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-af12fc",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-4d76ea",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
