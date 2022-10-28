organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-5802ed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "history" % "5.3.0-95787a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-router" % "6.4.2-6442a2",
  "org.scalablytyped" %%% "react-router-dom" % "6.4.2-75f7fc",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20220712Z-2afab5",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "remix-run__router" % "1.0.2-119df3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
