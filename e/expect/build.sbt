organization := "org.scalablytyped"
name := "expect"
version := "26.6.2-ef42b6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-502e56",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-707c57",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-a56c7d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-060d09",
  "org.scalablytyped" %%% "jest-diff" % "26.6.2-96aaa3",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.6.2-3c5411",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-2c91e1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
