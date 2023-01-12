organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.3.15-cb551e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-517873",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.1-ca34f8",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
