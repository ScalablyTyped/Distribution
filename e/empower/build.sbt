organization := "org.scalablytyped"
name := "empower"
version := "1.2-dt-20211202Z-fda30b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower-core" % "1.2-dt-20211202Z-e277df",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20220818Z-3d6d0e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
