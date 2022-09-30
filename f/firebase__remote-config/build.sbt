organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.3.11-a6eaaf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-ce1791",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-a02e57",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.2.0-998d8f",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-f102dd",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
