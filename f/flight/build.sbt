organization := "org.scalablytyped"
name := "flight"
version := "1.1.4-dt-20201002Z-8784cc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b9c3f6",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-27ba00",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
