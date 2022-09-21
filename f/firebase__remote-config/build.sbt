organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.3.11-0d0bec"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-70e6f2",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-442cc4",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-3354f1",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-0d2002",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
