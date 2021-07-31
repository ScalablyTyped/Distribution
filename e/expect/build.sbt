organization := "org.scalablytyped"
name := "expect"
version := "26.6.2-9b0349"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-2c3558",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-7566cb",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-a1e107",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-89a2ef",
  "org.scalablytyped" %%% "jest-diff" % "26.6.2-9eb21d",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.6.2-46f144",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-2cedcf",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
