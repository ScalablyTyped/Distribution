organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20201002Z-8226ab"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-06a062",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20201002Z-1a0b24",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-4d292a",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
