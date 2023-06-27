organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.4.4-10af2e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.13-0d6d5a",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-7842bf",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.3.0-6c7954",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-845e71",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
