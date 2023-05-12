organization := "org.scalablytyped"
name := "drag-controls"
version := "1.0-dt-20230123Z-350266"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fflate" % "0.7.3-686531",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "three" % "0.152-dt-20230503Z-bd3e2e",
  "org.scalablytyped" %%% "tweenjs__tween_dot_js" % "20.0.3-6d6531",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20230509Z-7ba919")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
