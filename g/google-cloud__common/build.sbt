organization := "org.scalablytyped"
name := "google-cloud__common"
version := "4.0.2-efe084"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-03c31a",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-691b62",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-38a64f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "teeny-request" % "8.0.2-388a8c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
