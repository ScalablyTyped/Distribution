organization := "org.scalablytyped"
name := "expo__package-manager"
version := "0.0.57-d41067"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-e30137",
  "org.scalablytyped" %%% "expo__spawn-async" % "1.7.0-51d8ef",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "ora" % "6.1.2-d425cd",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
