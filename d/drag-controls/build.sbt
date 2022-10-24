organization := "org.scalablytyped"
name := "drag-controls"
version := "1.0-dt-20211202Z-9678fa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "three" % "0.144-dt-20220902Z-3c5177",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-ef4a6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
